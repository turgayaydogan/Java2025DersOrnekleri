import java.util.Random;

public class o9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar1 = new int[20];
        int toplam = 0;

        // diziye eleman atama
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(100);
        }

        // elemanları ekrana yazdır
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("***************");

        // dizinin elamanlarını topla
        for (int i = 0; i < sayilar1.length; i++)
            toplam = toplam + sayilar1[i];

        System.out.println(toplam);

    }
}
