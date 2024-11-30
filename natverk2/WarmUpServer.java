import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.*;

public class WarmUpServer {
    private static boolean shutdown = false;

    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(12345)) {
            try (Socket connectionToClient = server.accept()) {
                Writer w = new OutputStreamWriter(connectionToClient.getOutputStream());
                w.append("Hello, world!\n");
                w.flush();
            }
        }
    }
}