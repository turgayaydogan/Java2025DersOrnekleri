import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class o2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        //değişken tanımlama 2 türlüde olabilir
        //int sayi1 = 0, sayi2 = 0, sonuc = 0;
        int sayi1, sayi2, sonuc;        //HATA VERMEZ
        String islem;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        giris.nextLine();

        System.out.println("İşlem:");
        islem = giris.nextLine();

        if (islem.equals("+")) {
            sonuc = sayi1 + sayi2;
            System.out.println("Sonuc=" + sonuc);
        } else if (islem.equals("-")) {
            sonuc = sayi1 - sayi2;
            System.out.println("Sonuc=" + sonuc);
        } else if (islem.equals("/")) {
            sonuc = sayi1 / sayi2;
            System.out.println("Sonuc=" + sonuc);
        } else if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
            System.out.println("Sonuc=" + sonuc);
        } else
            System.out.println("Tanımsız işlem");

    }
}
