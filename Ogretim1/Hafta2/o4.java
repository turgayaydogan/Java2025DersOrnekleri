import java.util.Scanner;

public class o4 {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi1,sayi2,toplam;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        toplam = sayi1 + sayi2;

        System.out.println(toplam);
    }
}