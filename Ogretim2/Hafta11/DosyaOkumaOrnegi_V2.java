import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DosyaOkumaOrnegi_V2 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";

            File dosya=new File(dosyaAdi);
            Path filePath = dosya.toPath();
            //Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            for (String satir : stringList) {
                System.out.println(satir);
            }
        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }

    }
}
