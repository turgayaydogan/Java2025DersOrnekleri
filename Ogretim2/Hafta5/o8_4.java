import java.util.Random;
import java.util.Scanner;

public class o8_4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        //0..99 dışında değer atanmalı
        //ya 0 dan küçük yada 99 dan büyük
        int tahmin=-1, tutulanSayi;

        tutulanSayi = rnd.nextInt(100);// 0..99
        System.out.println("Bir sayı tuttum haydi bil bakalım :)");
        
        while(tahmin!=tutulanSayi) {
            System.out.println("Tahmin:");
            tahmin = giris.nextInt();

            if (tahmin < tutulanSayi)
                System.out.println("Yukarı");
            if (tahmin > tutulanSayi)
                System.out.println("Aşağı");
            if (tahmin == tutulanSayi)
                System.out.println("Tebrikler");
        } 
    }
}
