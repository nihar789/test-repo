package com.iot.dashboard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class GadgetDAO {

    public boolean create(Gadget g, long ownerId) {
        String sql = "INSERT INTO gadgets (device_id, owner_id, type, model, room, status) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, g.getDeviceId());
            ps.setLong(2, ownerId);
            ps.setString(3, g.getType());
            ps.setString(4, g.getModel());
            ps.setString(5, g.getRoom());
            ps.setBoolean(6, g.isStatus());
            int rows = ps.executeUpdate();
            if (rows == 1) {
                try (ResultSet gk = ps.getGeneratedKeys()) {
                    if (gk.next()) g.setId(gk.getLong(1));
                }
                g.setOwnerId(ownerId);
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("GadgetDAO.create error: " + ex.getMessage());
        }
        return false;
    }

    public Gadget findByDeviceIdAndOwner(String deviceId, Long ownerId) {
        String sql = "SELECT id, device_id, owner_id, type, model, room, status FROM gadgets WHERE device_id = ? AND owner_id = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, deviceId);
            ps.setObject(2, ownerId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Long oid = null;
                    Object o = rs.getObject("owner_id");
                    if (o != null) oid = rs.getLong("owner_id");
                    return new Gadget(
                            rs.getLong("id"),
                            rs.getString("device_id"),
                            oid,
                            rs.getString("type"),
                            rs.getString("model"),
                            rs.getString("room"),
                            rs.getBoolean("status")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.println("GadgetDAO.findByDeviceIdAndOwner error: " + ex.getMessage());
        }
        return null;
    }

    public List<Gadget> findByOwner(long ownerId) {
        List<Gadget> out = new ArrayList<>();
        String sql = "SELECT id, device_id, owner_id, type, model, room, status FROM gadgets WHERE owner_id = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, ownerId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    out.add(rowToGadget(rs));
                }
            }
        } catch (SQLException ex) {
            System.err.println("GadgetDAO.findByOwner error: " + ex.getMessage());
        }
        return out;
    }


    public boolean updateStatus(String deviceId, boolean status) {
        String sql = "UPDATE gadgets SET status = ?, last_updated = CURRENT_TIMESTAMP WHERE device_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBoolean(1, status);
            ps.setString(2, deviceId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("GadgetDAO.updateStatus error: " + e.getMessage());
            return false;
        }
    }


    public boolean deleteByDeviceId(String deviceId, long ownerId) {
        String sql = "DELETE FROM gadgets WHERE device_id = ? AND owner_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, deviceId);
            stmt.setLong(2, ownerId);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException ex) {
            System.out.println("GadgetDAO.deleteByDeviceId error: " + ex.getMessage());
            return false;
        }
    }


    private Gadget rowToGadget(ResultSet rs) throws SQLException {
        Long ownerId = null;
        Object o = rs.getObject("owner_id");
        if (o != null) {
            ownerId = rs.getLong("owner_id");
        }
        return new Gadget(
                rs.getLong("id"),
                rs.getString("device_id"),
                ownerId,
                rs.getString("type"),
                rs.getString("model"),
                rs.getString("room"),
                rs.getBoolean("status")
        );
    }
}