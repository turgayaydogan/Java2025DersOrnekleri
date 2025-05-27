import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DosyaOkumaOrnegi_V3 {
    public static void main(String[] args) {
        try {
            //DİKKAT eğer aşağıdaki gibi dosya yolu yazarsanız 
            // .java dosyanızla txt dosyanız aynı konumda 
            // olacak demektir.
            // sizde bu şekilde kullanınız...
            String dosyaAdi = "ogrenciNotlari.txt";

            File dosya=new File(dosyaAdi);
            Path filePath = dosya.toPath();
            //Path filePath = new File(dosyaAdi).toPath();
            //Dosyanın bütün satırları birkerede okundu ve List e atandı
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            for (String satir : stringList) {
                //satırı ; göre paçala
                String[] parcalar = satir.split(";");
               
                /*
                parcalar[0] ==> Ögrno
                parcalar[1] ==> Ad
                parcalar[2] ==> Soyad
                parcalar[3] ==> Sınıf
                parcalar[4] ==> GNO
                .
                .
                */
                if(Double.parseDouble(parcalar[4])>1.8)
                    System.out.println(parcalar[1]+" "+parcalar[2]);
            }
        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }
    }
}
