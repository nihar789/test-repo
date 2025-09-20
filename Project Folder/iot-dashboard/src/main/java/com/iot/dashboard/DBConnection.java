package com.iot.dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = Config.get("db.url", "jdbc:mysql://localhost:3306/iot_dashboard?useSSL=false&allowPublicKeyRetrieval=true");
        String user = Config.get("db.user", "root");
        String pw = Config.get("db.password", "");
        return DriverManager.getConnection(url, user,pw);
    }
}
