package com.iot.dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/iot_dashboard?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "City@12345";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Connected to MySQL successfully!");
            } else {
                System.out.println("Connection failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}