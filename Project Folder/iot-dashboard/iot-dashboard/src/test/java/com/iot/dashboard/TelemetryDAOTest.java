package com.iot.dashboard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TelemetryDAOTest {
    private TelemetryDAO dao;

    @BeforeEach
    void setup() {
        dao = TelemetryDAO.local();
    }

    @Test
    void testPutTelemetry() {
        TelemetryRecord record = new TelemetryRecord("tv-1", "status", "ON", 1L);
        boolean result = dao.putTelemetry(record);
        assertTrue(result, "Telemetry should be written to DynamoDB");
    }
}