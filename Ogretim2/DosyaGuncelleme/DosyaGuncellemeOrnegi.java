import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class DosyaGuncellemeOrnegi {
    public static void main(String[] args) {
        try {
            // DİKKAT eğer aşağıdaki gibi dosya yolu yazarsanız
            // .java dosyanızla txt dosyanız aynı konumda
            // olacak demektir.
            // sizde bu şekilde kullanınız...
            String dosyaAdi = "ogrenciNotlari.txt";

            File dosya = new File(dosyaAdi);
            Path filePath = dosya.toPath();
            // Path filePath = new File(dosyaAdi).toPath();
            // Dosyanın bütün satırları birkerede okundu ve List e atandı
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());

            String degisecekSoyad;
            String yeniSoyad;
            String cevap;

            Scanner giris = new Scanner(System.in);
            System.out.print("Değişecek soyadı giriniz:");
            degisecekSoyad = giris.nextLine();

            System.out.print("Yeni soyadı giriniz:");
            yeniSoyad = giris.nextLine();

            for (int i = 0; i < stringList.size(); i++) {
                String satir = stringList.get(i);
                // satırı ; göre paçala
                String[] parcalar = satir.split(";");

                /*
                 * parcalar[0] ==> Ögrno
                 * parcalar[1] ==> Ad
                 * parcalar[2] ==> Soyad
                 * parcalar[3] ==> Sınıf
                 * parcalar[4] ==> GNO
                 * .
                 * .
                 */
                if (parcalar[2].equals(degisecekSoyad)) {
                    System.out.println(parcalar[0] + " " + parcalar[1] + " " + parcalar[2] + " " + parcalar[3] + " "
                            + parcalar[4]);
                    System.out.print("Değişecek kayıt bumu?(e/h):");
                    cevap = giris.nextLine();
                    if (cevap.toLowerCase().equals("e")) {
                        String yeniSatır = parcalar[0] + ";" + parcalar[1] + ";" + yeniSoyad + ";" + parcalar[3] + ";"
                                + parcalar[4]+ ";" + parcalar[5]+ ";" + parcalar[6]+ ";" + parcalar[7];
                        stringList.set(i, yeniSatır);// eski değeri değiştirdik
                    }
                }
            }

            // listeyi dosyaya yazıyoruz ve güncelleme bitti

            // dikkat FileWriter 2.parametresi false
            // var olan dosya üzerine yazıyoruz.
            FileWriter fw = new FileWriter(dosyaAdi, false);
            // bütün saırları yazıyoruz.
            for (String stringListeSatirlari : stringList) {
                fw.write(stringListeSatirlari + "\n");
            }
            fw.close();

        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }
    }
}
