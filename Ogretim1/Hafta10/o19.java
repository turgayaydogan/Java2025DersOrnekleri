import java.io.File;
import java.io.IOException;

public class o19 {
    public static void main(String[] args) throws IOException  {
        File file = new File("d:\\ogrenciler");
        File[] dosyalar = file.listFiles();

        for (File file1 : dosyalar) {
            if (file1.isFile()) {
                String[] parcalar = file1.getName().split("\\.");
                System.out.println(parcalar[0]);
                parcalar[0] += "Kopya";
                File kopyaDosya = new File("d:\\ogrenciler\\" + parcalar[0] + "." + parcalar[1]);
                kopyaDosya.createNewFile();
            }
        }

    }
}
