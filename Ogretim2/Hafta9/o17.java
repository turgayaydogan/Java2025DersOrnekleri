import java.io.File;

public class o17 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler");
        if (!file.exists())
            file.mkdir();

    }
}
