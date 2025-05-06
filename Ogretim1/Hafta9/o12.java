import java.io.File;
import java.io.IOException;

public class o12 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\ogrenciler\\ogrenciBilgileri.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

    }
}
