import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;
import java.util.*;

public class ExerciseFour {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HashMap<String, Integer> hashMap = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int input = -1;
            while (true) {
                // Skapa en ny begäran varje gång för att få ett nytt skämt
                URI getJokeUri = URI.create("https://icanhazdadjoke.com/");
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(getJokeUri)
                        .header("Accept", "text/plain")
                        .header("User-Agent", "Yrgo OOP Class (https://yrgo.se)")
                        .build();
                HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

                // Visa skämtet och be om betyg
                System.out.println(resp.body());
                System.out.println("Rate the joke 1-10");

                // Läs in användarens betyg
                input = scanner.nextInt();
                
                // Lägg till skämtet och betyget i hashMap
                hashMap.put(resp.body(), input);

                System.out.println("Do you want another joke? yes(1) no(0)");
                input = scanner.nextInt();
                if (input == 0) {
                    break;
                }
            }
        }
        String bestJoke = "";
        int bestRating = 0;
        // Skriv ut alla betyg
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > bestRating) {
                bestJoke = entry.getKey();
                bestRating = entry.getValue();
            }
        }
        System.out.println("\nHighest rated joke:\n" + bestJoke + "\nRating:" + bestRating);
    }
}
