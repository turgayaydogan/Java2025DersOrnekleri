import java.util.Random;
import java.util.Scanner;

public class o7_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);

        int tutulanSayi, tahmin;

        tutulanSayi = rnd.nextInt(100);

        System.out.println("Bir sayı tuttum, haydi bil bakalım :)");

        do {
            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            else if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            else //else if (tutulanSayi == tahmin)
                System.out.println("Tebrikler");

        } while (tutulanSayi != tahmin);
    }
}
