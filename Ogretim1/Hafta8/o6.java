import java.util.Random;

public class o6 {
    //Çalıştığında 0-100 arasında bir tam sayı tutup 
    //geriye tuttuğu bu tam sayıyı döndüren metodu yazınız.

    public static void main(String[] args) {
        int sonuc = sayiTut();
        System.out.println(sonuc);


        for (int i = 0; i < 10; i++) {
            System.out.println(sayiTut());
        }
    }

    public static int sayiTut(){
        Random rnd=new Random();
        int sayi = rnd.nextInt(100);

        return sayi;
    }
}
