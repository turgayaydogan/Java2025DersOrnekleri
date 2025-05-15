import java.io.FileNotFoundException;
import java.io.FileReader;

public class o21 {
    public static void main(String[] args) throws Throwable {
        String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc = fr.read();
        while (sonuc != -1) {
            System.out.print((char) sonuc);
            sonuc = fr.read();
        }
        fr.close();

    }
}
