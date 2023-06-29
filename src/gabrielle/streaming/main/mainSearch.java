package gabrielle.streaming.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder; //p configurar os campos que vao ser interpretados do bd
import gabrielle.streaming.template.Title;
import gabrielle.streaming.template.TitleOMDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// WEB SERVICE:
// Using an Movie and Series web API.
// Using dependence: GSON


public class mainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner reading = new Scanner(System.in); //scanner
        System.out.println("Search a titleOMDB: ");
        var search = reading.nextLine(); //user input

        String address = "https://www.omdbapi.com/?t=" + search.replace(" ","+") + "&apikey=e03c8ba";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String json = response.body();
            System.out.println(json);

//      transform this into a Class.
//      use special library Gson. converting Json to my class Movie

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TitleOMDB titleOMDB = gson.fromJson(json, TitleOMDB.class);
            System.out.println(titleOMDB);
            System.out.println();

            //try { //para lidar com exceções try-catch
            Title myTitle = new Title(titleOMDB);
            System.out.println("converted title: ");
            System.out.println(myTitle);
        } catch (NumberFormatException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("error");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("some error happened: " + e.getMessage());
        }
        finally {
            System.out.println("end of verification");
        }

    }
}
