import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class KitapBilgisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ISBN girin (örn:9789755705859 - 9789752894662): ");
        String isbn = scanner.nextLine();

        String urlStr = "https://openlibrary.org/isbn/" + isbn + ".json";

        try {
            // eski versiyonlarda aşağıdaki kullanım çalışır ama tavsiye edilmez
            // URL url = new URL(urlStr);

            // yeni versiyonda
            URI uri = URI.create(urlStr);
            URL url = uri.toURL();
            HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();
            baglanti.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(baglanti.getInputStream()));
            String satir;
            /*
             * StringBuilder kullanılabilir
             * StringBuilder veri = new StringBuilder();
             * 
             * while ((satir = br.readLine()) != null) {
             * veri.append(satir);
             * }
             */

            // VEYA
            String veri = "";

            while ((satir = br.readLine()) != null) {
                veri += satir;
            }
            br.close();

            System.out.println("Kitap Bilgisi:");
            System.out.println(veri.toString());

            System.out.println("********************");

            String baslik = getirKitapBasligi(veri);

            if (baslik != null) {
                System.out.println("Kitap Başlığı: " + baslik);
            } else {
                System.out.println("Başlık bilgisi bulunamadı.");
            }

        } catch (Exception e) {
            System.out.println("Kitap bilgisi alınamadı. Hatalı ISBN olabilir.");
        }
    }
    //getBookTitle
    public static String getirKitapBasligi(String json) {
        if (json.contains("\"title\"")) {
            String[] bolumler = json.split(",");
            for (String b : bolumler) {
                if (b.contains("\"title\"")) {
                    String[] parca = b.split(":");
                    if (parca.length > 1) {
                        return parca[1].replace("\"", "").trim();
                    }
                }
            }
        }
        return null;
    }

    public static String getirKitapBasligi_V2(String json) {
        String bulunanBaslik=null;
        if (json.contains("\"title\"")) {
            String[] bolumler = json.split(",");
            for (String b : bolumler) {
                if (b.contains("\"title\"")) {
                    String[] parca = b.split(":");
                    if (parca.length > 1) {
                        bulunanBaslik = parca[1].replace("\"", "").trim();
                    }
                }
            }
        }
        return bulunanBaslik;
    }
}
