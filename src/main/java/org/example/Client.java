package org.example;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
        } catch (Exception e) {
            System.out.println("Error1: " + e.getMessage());
        }
    }
    public String sendMessage(String msg) {
        try {
            out.writeUTF(msg);
            return in.readUTF();
        } catch (Exception e) {
            System.out.println("Error2: " + e.getMessage());
            return null;
        }
    }
    public String stopConnection() {
        try {
            var status=sendMessage("close");
            in.close();
            out.close();
            clientSocket.close();
            return status;
        } catch (Exception e) {
            System.out.println("Error3: " + e.getMessage());
            return "failed";
        }
    }
}
