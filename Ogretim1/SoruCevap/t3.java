import java.util.Random;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();

        int kasa = 0;
        int adet = 0;

        kasa = 1 + rnd.nextInt(9);// 1

        System.out.println("Kaç sefer daha tutatlım:");// 2
        adet = giris.nextInt(); // 3

        // 4
        for (int i = 0; i < adet; i++) {
            int deger = 1 + rnd.nextInt(9);
            kasa += deger;
        }
        System.out.println("Kasa:" + kasa);
        if (kasa >= 35 && kasa <= 40)
            System.out.println("Tebrikler, kazandınız");
        else
            System.out.println("Üzgünüm kaybettiniz.");

    }
}
