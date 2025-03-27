import java.util.Random;
import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();

        int tahmin, tutulanSayi;

        tutulanSayi = rnd.nextInt(100);// 0..99
        System.out.println("Bir sayı tuttum haydi bil bakalım :)");
        
        do {
            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tahmin < tutulanSayi)
                System.out.println("Yukarı");
            if (tahmin > tutulanSayi)
                System.out.println("Aşağı");
            if (tahmin == tutulanSayi)
                System.out.println("Tebrikler");
        } while (tahmin!=tutulanSayi);

    }
}
