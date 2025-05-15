import java.io.File;

public class o7 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler");
        File[] dosyalar = file.listFiles();

        if (dosyalar != null) {// dosyalar dizisi boş değilse
            for (File f : dosyalar) {
                if (f.isFile()) {//sıradaki f nesnesi dosya ise
                    System.out.println("Dosya: " + f.getName());
                }
            }
        }
    }
}