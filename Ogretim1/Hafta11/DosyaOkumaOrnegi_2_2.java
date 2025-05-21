import java.io.BufferedReader;
import java.io.FileReader;

public class DosyaOkumaOrnegi_2_2 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciNotlari.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
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
                System.out.println(parcalar[1]+" "+parcalar[2]);                
                satir = oku.readLine();
            }
            oku.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
