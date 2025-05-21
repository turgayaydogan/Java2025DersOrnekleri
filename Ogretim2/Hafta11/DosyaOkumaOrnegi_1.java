import java.io.BufferedReader;
import java.io.FileReader;

public class DosyaOkumaOrnegi_1 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
                System.out.println(satir);                
                satir = oku.readLine();
            }
            oku.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
