import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class o22 {
    public static void main(String[] args) throws IOException {
        String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        String satir = oku.readLine();
        while (satir != null) {
            System.out.println(satir);
            satir = oku.readLine();
        }
        oku.close();

    }
}
