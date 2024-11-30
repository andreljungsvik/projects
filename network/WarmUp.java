import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;

public class WarmUp {
    public static void main(String[] args) throws IOException,
            InterruptedException {
        // create a URI, location to which we will connect
        URI jokeUri = URI.create("https://v2.jokeapi.dev/joke/Any?format=txt");
        // create a client, the object that will send/receive our data
        HttpClient client = HttpClient.newHttpClient();
        // build a request, the information we will send to the URI
        HttpRequest request = HttpRequest.newBuilder().uri(jokeUri).build();
        // actually send the request and get a response back
        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());
        // print the data (hopefully we got something back)2
        System.out.println(resp.body().trim());
    }
}