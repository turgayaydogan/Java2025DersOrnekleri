import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class SpaceXApiOrnegi {
    public static void main(String[] args) {
        try {
            String apiURL = "https://api.spacexdata.com/v4/launches/latest";

            URI uri = URI.create(apiURL);
            URL url = uri.toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();

            System.out.println("Son görev bilgisi:");
            System.out.println(result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
