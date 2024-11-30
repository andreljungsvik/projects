import java.io.*;
import java.net.*;

public class Exercise3Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(1337)) {
            System.out.println("Server is listening on port 1337...");
            try (Socket connectionToClient = server.accept();
                    InputStream is = connectionToClient.getInputStream();
                    DataInputStream dataInput = new DataInputStream(is)) {
                System.out.println("Client connected!");
                boolean isBinary = dataInput.readBoolean();
                if (isBinary) {
                    try (OutputStream os = new FileOutputStream("output.bin")) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = dataInput.read(buffer)) != -1) {
                            os.write(buffer, 0, bytesRead);
                        }
                        System.out.println("Binary data written to file: output.bin");
                    }
                } else {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line);
                            writer.newLine();
                        }
                        System.out.println("Text data written to file: output.txt");
                    }
                }
            } catch (IOException e) {
                System.err.println("Error during client communication: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error starting the server: " + e.getMessage());
        }
    }
}
