package com.iot.dashboard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GadgetDAOTest {
    private GadgetDAO dao;

    @BeforeEach
    void setup() {
        dao = new GadgetDAO();
    }

    @Test
    void testFindByDeviceId() {
        Gadget g = dao.findByDeviceIdAndOwner("tv-1", 1L);
        assertNotNull(g, "Device should be found in DB");
        assertEquals("tv-1", g.getDeviceId());
    }
}
