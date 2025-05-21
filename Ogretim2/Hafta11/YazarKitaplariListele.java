import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class YazarKitaplariListele {
    public static void main(String[] args) {
        try {
            String yazarAdi = "yasar kemal";
            String yazarQuery = URLEncoder.encode(yazarAdi, "UTF-8");
            String apiURL = "https://openlibrary.org/search.json?author=" + yazarQuery + "&sort=new";

            URI uri = URI.create(apiURL);
            URL url = uri.toURL();

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String satir;
            String veri = "";

            while ((satir = br.readLine()) != null) {
                veri += satir;
            }
            br.close();
            System.out.println();
            System.out.println(veri);
            System.out.println();
            // "docs" dizisini ayıkla
            String[] kitaplar = veri.split("\\},        \\{"); // her kitap nesnesini ayır
            System.out.println("***********");
            System.out.println(kitaplar[0]);
            int sayac = 1;
            for (String kitap : kitaplar) {
                String baslik = parcaGetir(kitap, "\"title\":",0);
                baslik = java.net.URLDecoder.decode(baslik, "UTF-8");
                baslik = baslik.replace("\\u0131", "ı")
                        .replace("\\u00e7", "ç")
                        .replace("\\u011f", "ğ")
                        .replace("\\u00fc", "ü")
                        .replace("\\u015f", "ş")
                        .replace("\\u00f6", "ö")
                        .replace("\\u0130", "İ")
                        .replace("\\u015e", "Ş")
                        .replace("\\u00d6", "Ö")
                        .replace("\\u00c7", "Ç");
                String yazar = parcaGetir(kitap, "\"author_name\":\\[\"",0);
                String yil = parcaGetir(kitap, "\"first_publish_year\":",1);

                if (baslik != null) {
                    System.out.println("Kitap " + sayac++);
                    System.out.println("Başlık: " + baslik);
                    System.out.println("Yazar: " + (yazar != null ? yazar : "Bilinmiyor"));
                    System.out.println("Yıl: " + (yil != null ? yil : "Bilinmiyor"));
                    System.out.println("------------------------");
                }

                //if (sayac > 5)
                //    break; // sadece ilk 5 kitabı gösterelim örnek için
            }

        } catch (Exception e) {
            System.out.println("Hata oluştu: " + e.getMessage());
        }
    }

    // Belirtilen anahtar kelimeye göre veri ayıklar
    public static String parcaGetir(String veri, String anahtar, int tur) {
        int index = veri.indexOf(anahtar);
        if (index != -1) {
            int basla = index + anahtar.length();
            int bitis = veri.indexOf("\"", basla);
            if(tur==0)bitis = veri.indexOf("\"", bitis + 1);
            if (bitis > basla) {
                return veri.substring(basla, bitis);
            }
        }
        return null;
    }
}
