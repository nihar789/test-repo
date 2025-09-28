package com.iot.dashboard;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Optional;


public class DeviceClient {
    private final String host;
    private final int port;

    private static final int CONNECT_TIMEOUT_MS = 1500;
    private static final int READ_TIMEOUT_MS = 2000;

    public DeviceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }


    public Optional<String> sendCommand(String cmd) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), CONNECT_TIMEOUT_MS);
            socket.setSoTimeout(READ_TIMEOUT_MS);

            try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                out.write(cmd);
                out.write("\n");
                out.flush();

                String response = in.readLine();
                if (response == null) return Optional.empty();
                return Optional.of(response.trim());
            }
        } catch (Exception e) {
            System.out.println("Device unreachable (" + host + ":" + port + "): " + e.getMessage());
            return Optional.empty();
        }
    }

    public boolean sendSetStatusCommand(boolean on) {
        String cmd = on ? "SET ON" : "SET OFF";
        return sendCommand(cmd).map(resp -> resp.equalsIgnoreCase("OK")).orElse(false);
    }
}