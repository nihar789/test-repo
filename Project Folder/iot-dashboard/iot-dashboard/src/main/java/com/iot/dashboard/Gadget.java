package com.iot.dashboard;

public class Gadget {
    private Long id;
    private String deviceId;
    private Long ownerId;
    private String type;
    private String model;
    private String room;
    private boolean status;

    public Gadget(Long id, String deviceId, Long ownerId, String type, String model, String room, boolean status) {
        this.id = id;
        this.deviceId = deviceId;
        this.ownerId = ownerId;
        this.type = type;
        this.model = model;
        this.room = room;
        this.status = status;
    }


    public Gadget(Long id, String deviceId, String type, String model, String room, boolean status) {
        this(id, deviceId, null, type, model, room, status);
    }

    public Long getId() { return id; }
    public String getDeviceId() { return deviceId; }
    public Long getOwnerId() { return ownerId; }
    public String getType() { return type; }
    public String getModel() { return model; }
    public String getRoom() { return room; }
    public boolean isStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setOwnerId(Long ownerId) { this.ownerId = ownerId; }
    public void setStatus(boolean status) { this.status = status; }
}