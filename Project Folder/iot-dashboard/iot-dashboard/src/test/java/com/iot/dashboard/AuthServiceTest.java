package com.iot.dashboard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    @Test
    void testPasswordHashing() {
        String password = "mypassword";
        String hash = AuthService.hashPassword(password);

        assertNotNull(hash, "Hash should not be null");
        assertNotEquals(password, hash, "Hash should not match plain password");
        assertTrue(AuthService.verifyPassword(password, hash), "Password should match hash");
    }
}