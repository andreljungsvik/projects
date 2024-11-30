import java.io.*;
import java.net.*;
import java.text.ParsePosition;
import java.util.*;

public class Exercise1Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 1337);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

                int serverInt = Integer.parseInt(reader.readLine());
                System.out.println("Received from server: " + serverInt);

                Random rand = new Random();
                int random = serverInt + 1 + rand.nextInt(100);

                writer.write(random + "\n");
                writer.flush();
        }
    }
}
