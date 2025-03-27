import java.util.Random;
import java.util.Scanner;

public class o7_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);
        //tahmin=0; HATALI dır çünkü tutulanSayi 0 olabilir
        //programın çalışmasını olumsuz etkilemeyecek değer atanmalı
        // 0 dan küçük veya 100 den büyük
        int tutulanSayi, tahmin=-1;

        tutulanSayi = rnd.nextInt(100);

        System.out.println("Bir sayı tuttum, haydi bil bakalım :)");

        while (tutulanSayi != tahmin) {
            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            else if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            else //else if (tutulanSayi == tahmin)
                System.out.println("Tebrikler");

        } 
    }
}
