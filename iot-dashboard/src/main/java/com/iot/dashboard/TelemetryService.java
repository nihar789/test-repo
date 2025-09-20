package com.iot.dashboard;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TelemetryService {

    public void writeTelemetry(String deviceId, String metric, String value) {
        String sql = "INSERT INTO telemetry (device_id, metric, value) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, deviceId);
            ps.setString(2, metric);
            ps.setString(3, value);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("TelemetryService.writeTelemetry error: " + ex.getMessage());
        }
    }
}
