package com.iot.dashboard;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class AuthService {
    private static boolean hasBCrypt = false;

    static {
        try {
            Class.forName("org.mindrot.jbcrypt.BCrypt");
            hasBCrypt = true;
        } catch (ClassNotFoundException e) {
            hasBCrypt = false;
        }
    }

    public static String hashPassword(String plain) {
        if (hasBCrypt) {
            return org.mindrot.jbcrypt.BCrypt.hashpw(plain, org.mindrot.jbcrypt.BCrypt.gensalt(10));
        } else {
            try {
                byte[] salt = new byte[8];
                new SecureRandom().nextBytes(salt);
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(salt);
                byte[] dig = md.digest(plain.getBytes("UTF-8"));
                return Base64.getEncoder().encodeToString(salt) + ":" + Base64.getEncoder().encodeToString(dig);
            } catch (Exception ex) {
                throw new RuntimeException("Hash error", ex);
            }
        }
    }

    public static boolean verifyPassword(String plain, String stored) {
        if (stored == null) return false;
        if (hasBCrypt) {
            return org.mindrot.jbcrypt.BCrypt.checkpw(plain, stored);
        } else {
            try {
                String[] parts = stored.split(":");
                if (parts.length != 2) return false;
                byte[] salt = Base64.getDecoder().decode(parts[0]);
                byte[] hash = Base64.getDecoder().decode(parts[1]);
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(salt);
                byte[] dig = md.digest(plain.getBytes("UTF-8"));
                if (dig.length != hash.length) return false;
                for (int i = 0; i < dig.length; i++) if (dig[i] != hash[i]) return false;
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
    }
}
