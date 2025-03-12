import java.util.Scanner;

public class o15 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1=0, sayi2=0, sonuc=0;
        String islem;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        giris.nextLine();

        System.out.println("İşlem:");
        islem = giris.nextLine();

        if (islem.equals("+"))
            sonuc = sayi1 + sayi2;
        else if (islem.equals("-"))
            sonuc = sayi1 - sayi2;
        else if (islem.equals("/"))
            sonuc = sayi1 / sayi2;
        else
            sonuc = sayi1 * sayi2;

        System.out.println("Sonuc=" + sonuc);
    }
}
