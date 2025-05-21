import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class CountryAPIOrnegi {
    public static void main(String[] args) {
        try {
          
            String ulke = "turkey"; 
            String apiURL = "https://restcountries.com/v3.1/name/" + URLEncoder.encode(ulke, "UTF-8");

            URI uri = URI.create(apiURL);
            URL url = uri.toURL();

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();

            String json = result.toString();
            System.out.println(json);

            // Basit JSON parçalama
            String baskent = parcaGetir(json, "\"capital\":[\"");
            String nufus = parcaGetir(json, "\"population\":");
            String bolge = parcaGetir(json, "\"region\":\"");

            System.out.println("Ülke: " + ulke.toUpperCase());
            System.out.println("Başkent: " + baskent);
            System.out.println("Nüfus: " + nufus);
            System.out.println("Bölge: " + bolge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String parcaGetir(String veri, String anahtar) {
        int index = veri.indexOf(anahtar);
        if (index == -1)
            return null;
        int basla = index + anahtar.length();
        int bitis = veri.indexOf("\"", basla);
        return veri.substring(basla, bitis);
    }
}
