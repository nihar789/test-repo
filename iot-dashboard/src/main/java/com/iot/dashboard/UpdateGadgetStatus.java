package com.iot.dashboard;

public class UpdateGadgetStatus {
    private final GadgetDAO gadgetDAO;
    private final TelemetryService telemetry;

    public UpdateGadgetStatus(GadgetDAO gadgetDAO, TelemetryService telemetry) {
        this.gadgetDAO = gadgetDAO;
        this.telemetry = telemetry;
    }

    public boolean applyStatus(String deviceId, long loggedInCustomerId, boolean desiredOn) {

        Gadget g = gadgetDAO.findByDeviceIdAndOwner(deviceId, loggedInCustomerId);
        if (g == null) {
            System.out.println("Device not found or not owned by you: " + deviceId);
            return false;
        }


        int port = DevicePortMapper.getPort(deviceId);
        if (port <= 0) {
            System.out.println("No port mapping for device: " + deviceId);
        }

        DeviceClient client = new DeviceClient("localhost", port);
        boolean deviceConfirmed = client.sendSetStatusCommand(desiredOn);

        if (!deviceConfirmed) {
            System.out.println("Warning: device did not confirm status change (or unreachable). Updating DB anyway.");
        } else {
            System.out.println("Device confirmed status change (" + deviceId + ").");
        }

        boolean updated = gadgetDAO.updateStatus(deviceId, desiredOn);
        if (updated) {
            TelemetryRecord record = new TelemetryRecord(
                    deviceId,
                    "status",
                    desiredOn ? "ON" : "OFF",
                    Long.valueOf(loggedInCustomerId)
            );

            try {
                TelemetryDAO telemetryDAO = new TelemetryDAO("http://localhost:8000", "Telemetry");
                telemetryDAO.putTelemetry(record);
                System.out.println("Status updated in DB and telemetry written to DynamoDB.");
            } catch (Exception e) {
                System.out.println("Status updated in DB but failed to write telemetry: " + e.getMessage());
            }

            return true;
        } else {
            System.out.println("Failed to update gadget status in DB (check deviceId/ownership).");
            return false;
        }

    }
}