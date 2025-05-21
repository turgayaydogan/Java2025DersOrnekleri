import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DosyaOkumaOrnegi_2 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciNotlari.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
                //System.out.println(satir);
                String[] parcalar = satir.split(";");
                //System.out.println(parcalar.length);
                if(Double.parseDouble(parcalar[4])>1.8)
                    System.out.println(parcalar[1]+" "+parcalar[2]);
                satir = oku.readLine();
            }
            oku.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static void listeOlarakOku() {
        try {
            String dosyaAdi = "D:\\ogrenciNotlari.txt";

            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            for (String satir : stringList) {
                System.out.println(satir);
            }
        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }
    }
}
