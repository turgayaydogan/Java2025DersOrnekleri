import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class MealDBOrnegi {
    public static void main(String[] args) {
        try {
            String yemekAdi = "pizza"; // kullanıcıdan da alınabilir
            String apiURL = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + URLEncoder.encode(yemekAdi, "UTF-8");

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

            String json = result.toString();

            // Basit şekilde yemek adı ve tarifini bulalım
            String meal = parcaGetir(json, "\"strMeal\":\"");
            String instructions = parcaGetir(json, "\"strInstructions\":\"");

            System.out.println("Yemek: " + meal);
            System.out.println("Tarif: " + instructions);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String parcaGetir(String veri, String anahtar) {
        int index = veri.indexOf(anahtar);
        if (index == -1) return null;
        int basla = index + anahtar.length();
        int bitis = veri.indexOf("\"", basla);
        return veri.substring(basla, bitis).replace("\\r\\n", "\n");
    }
}
