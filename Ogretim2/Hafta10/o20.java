import java.io.FileWriter;
import java.io.IOException;

public class o20 {
    public static void main(String[] args) throws Exception {
        String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
        FileWriter fw = new FileWriter(dosyaAdi, true);
        fw.write("Ali" + "\n");
        fw.write("Ahmet" + "\n");
        fw.write("Ayşe" + "\n");
        fw.write("Elif" + "\n");
        fw.close();

    }
}
