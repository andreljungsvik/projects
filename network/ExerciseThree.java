import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;
import java.nio.file.*;

public class ExerciseThree {
    public static void main(String[] args) throws IOException, InterruptedException {
        URI theUri = URI.create("https://en.wikipedia.org/wiki/Java_(programming_language)");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(theUri).build();
        HttpResponse<Path> resp = client.send(request, BodyHandlers.ofFile(Paths.get("filen.txt")));
    }
}
