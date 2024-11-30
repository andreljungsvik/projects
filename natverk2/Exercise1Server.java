import java.io.*;
import java.net.*;
import java.util.*;

public class Exercise1Server {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int random = rand.nextInt(300);
        try (ServerSocket server = new ServerSocket(1337);
                Socket connectionToClient = server.accept();

                InputStream is = connectionToClient.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));

                OutputStream os = connectionToClient.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));) {


                writer.write(random + "\n");
                writer.flush();

                int clientInt = Integer.parseInt(reader.readLine());
                System.out.println("Received from client: " + clientInt);
        }

    }
}
