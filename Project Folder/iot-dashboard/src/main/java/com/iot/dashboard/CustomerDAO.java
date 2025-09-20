package com.iot.dashboard;

import java.sql.*;

public class CustomerDAO {

    public Customer findByEmail(String email) {
        String sql = "SELECT id, name, email, password_hash FROM customers WHERE email = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Customer(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password_hash")
                );
            }
        } catch (Exception ex) {
            System.err.println("CustomerDAO.findByEmail error: " + ex.getMessage());
        }
        return null;
    }

    public boolean create(Customer customer) {
        String sql = "INSERT INTO customers (name, email, password_hash) VALUES (?, ?, ?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPasswordHash());
            int rows = ps.executeUpdate();
            if (rows == 1) {
                ResultSet gk = ps.getGeneratedKeys();
                if (gk.next()) customer.setId(gk.getLong(1));
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("CustomerDAO.create error: " + ex.getMessage());
        }
        return false;
    }
}
