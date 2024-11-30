
import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;

public class ExerciseTwo {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI getJokeUri = URI.create("https://icanhazdadjoke.com/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(getJokeUri)
                .header("Accept", "text/plain")
                .header("User-Agent",
                        "Yrgo OOP Class (https://yrgo.se)")
                .build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        if (resp.statusCode() == 200) {
            System.out.println(resp.body());
        }

    }
}
