import java.util.Random;
import java.util.Scanner;

public class o8_3 {
    public static void main(String[] args) {
        //MANTIKSAL HATA var
        //çünkü tutulan sayı 0 olabilir
        //tahmin değişkenine programın çalışmasını olumsuz etkilemeyecek bir başlangıç değeri atanmalı
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();

        int tahmin=0, tutulanSayi;

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
