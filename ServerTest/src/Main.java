import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(5001)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String input = bufferedReader.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Echoing user input: " + input);
                output.println(input);
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }

    }
}
