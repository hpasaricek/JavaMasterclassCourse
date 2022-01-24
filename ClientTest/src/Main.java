import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost", 5001)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String input;
            String receivedEcho;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Enter the string you wish to echo:");
                input = scanner.nextLine();
                output.println(input);
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting connection to the server.");
                    break;
                }
                receivedEcho = bufferedReader.readLine();
                System.out.println("Echoing received from server: " + receivedEcho);
            } while (!input.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }

    }
}
