import java.io.File;

public class o6 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler");
        File[] dosyalar = file.listFiles();

        for (File file1 : dosyalar) {
            System.out.println(file1.getName());
        }

    }
}
