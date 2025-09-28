package com.iot.dashboard;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties props = new Properties();

    static {
        try {
            InputStream in = new FileInputStream("config.properties");
            props.load(in);
            in.close();
        } catch (Exception e) {
            System.err.println("Warning: config.properties not found. Using defaults.");
        }
    }

    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }

    public static String get(String key) {
        return get(key,null);
    }
}