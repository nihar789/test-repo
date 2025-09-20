package com.iot.dashboard;

import java.time.Instant;

public class TelemetryRecord {
    private String deviceId;
    private String metric;
    private String value;
    private Long ownerId;
    private long ts;

    public TelemetryRecord(String deviceId, String metric, String value, Long ownerId) {
        this.deviceId = deviceId;
        this.metric = metric;
        this.value = value;
        this.ownerId = ownerId;
        this.ts = Instant.now().toEpochMilli();
    }

    public TelemetryRecord(String deviceId, String metric, String value) {
        this(deviceId, metric, value, null);
    }

    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public String getMetric() { return metric; }
    public void setMetric(String metric) { this.metric = metric; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public Long getOwnerId() { return ownerId; }
    public void setOwnerId(Long ownerId) { this.ownerId = ownerId; }

    public long getTs() { return ts; }
    public void setTs(long ts) { this.ts = ts; }
}