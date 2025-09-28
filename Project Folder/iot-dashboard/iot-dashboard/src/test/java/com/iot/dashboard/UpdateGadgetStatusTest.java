package com.iot.dashboard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UpdateGadgetStatusTest {
    private GadgetDAO gadgetDAO;
    private TelemetryService telemetry;
    private UpdateGadgetStatus updater;

    @BeforeEach
    void setup() {
        gadgetDAO = new GadgetDAO();
        telemetry = new TelemetryService();
        updater = new UpdateGadgetStatus(gadgetDAO, telemetry);
    }

    @Test
    void testApplyStatusUpdatesDB() {
        boolean result = updater.applyStatus("tv-1", 1L, true);
        assertTrue(result, "Status update should succeed for owned device");
    }
}