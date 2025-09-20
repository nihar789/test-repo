package com.iot.dashboard;

import java.util.HashMap;
import java.util.Map;

public class DevicePortMapper {
    private static final Map<String,Integer> map = new HashMap<>();

    static {
        map.put("tv-1", 9001);
        map.put("fan-1", 9002);
        map.put("ac-1", 9003);
    }

    public static int getPort(String deviceId) {
        return map.getOrDefault(deviceId.toLowerCase(),9000);
    }
}
