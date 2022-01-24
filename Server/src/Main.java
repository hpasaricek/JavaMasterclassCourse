import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            DatagramSocket serverSocket = new DatagramSocket(5000);
            byte[] buffer = new byte[50];
            DatagramPacket serverPacket = new DatagramPacket(buffer, buffer.length);
            serverSocket.receive(serverPacket);
            System.out.println(new String(buffer));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
