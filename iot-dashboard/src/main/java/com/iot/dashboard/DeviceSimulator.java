package com.iot.dashboard;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DeviceSimulator {
    private String deviceId;
    private boolean status;

    public DeviceSimulator(String deviceId, boolean initialStatus) {
        this.deviceId = deviceId;
        this.status = initialStatus;
    }

    public void start(int port) throws IOException {
        System.out.println("Device " + deviceId + " started on port " + port);
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket client = serverSocket.accept();
                new Thread(() -> handleClient(client)).start();
            }
        }
    }

    private void handleClient(Socket client) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

            String line;
            while ((line = in.readLine()) != null) {
                if (line.equalsIgnoreCase("STATUS")) {
                    out.write(status ? "ON\n" : "OFF\n");
                    out.flush();
                } else if (line.equalsIgnoreCase("SET ON")) {
                    status = true;
                    out.write("OK\n"); out.flush();
                } else if (line.equalsIgnoreCase("SET OFF")) {
                    status = false;
                    out.write("OK\n"); out.flush();
                } else {
                    out.write("ERR\n"); out.flush();
                }
            }
        } catch (IOException e) {
            System.out.println("Client disconnected from " + deviceId);
        }
    }

    public static void main(String[] args) throws Exception {
        String deviceId = args.length > 0 ? args[0] : "tv-1";
        int port = args.length > 1 ? Integer.parseInt(args[1]) : 9001;
        new DeviceSimulator(deviceId, false).start(port);
    }
}