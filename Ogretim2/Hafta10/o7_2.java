import java.io.File;

public class o7_2 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler");
        File[] dosyalar = file.listFiles();

        if (dosyalar != null) {// dosyalar dizisi boş değilse
            for (File f : dosyalar) {
                if (f.isDirectory()) {//sıradaki f nesnesi klasör ise
                    System.out.println("Klasör: " + f.getName());
                }
            }
        }

    }
}
