package org.example;

public class Main {
    public static void main(String[] args) {
        var client1 = new Client();
        var client2 = new Client();
        var client3 = new Client();
        client1.startConnection("127.0.0.1", 6666);
//        client2.startConnection("127.0.0.1", 6666);
//        client3.startConnection("127.0.0.1", 6666);
        System.out.println(client1.sendMessage("11Hello\nCc\nDcmm"));
//        System.out.println(client2.sendMessage("12Hello\nC\nDcmm"));
//        System.out.println(client3.sendMessage("13Hello\nCc\nDcmm"));
        System.out.println(client1.sendMessage("14Hello\nCc\nDcmm"));
        System.out.println(client1.stopConnection());
    }
}