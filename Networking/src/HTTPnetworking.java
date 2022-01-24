import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HTTPnetworking {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=dogs");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if (responseCode != 200) {
                System.out.println("Error reading webpage");
                System.out.println(connection.getResponseMessage());
                return;
            }

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
            inputStream.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
