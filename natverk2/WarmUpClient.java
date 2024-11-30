import java.io.*;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class WarmUpClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 12345);
                Reader reader = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(reader)) {
            System.out.println(br.readLine());
        }
    }
}