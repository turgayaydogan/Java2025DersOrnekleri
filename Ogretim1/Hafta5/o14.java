import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class o14 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi,sayac=0,toplam=0;

        do{
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            if(sayi>10){
                sayac++;
                toplam = toplam + sayi;
            }
        }while(sayi>=0);
        System.out.println("Adet="+sayac);
        System.out.println("Toplam="+toplam);
    }
}
