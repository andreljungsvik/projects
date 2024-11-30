import java.io.*;
import java.net.*;

public class Exercise2 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("www.google.com", 80)) {
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            writer.write("GET / HTTP/1.1\nHost: www.google.com\nConnection: close\n\n");
            writer.flush();

            
            System.out.println(reader.readLine());

        } catch (IOException e) {
            e.getMessage();
        }
    }
}