import java.util.Scanner;

public class o15 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sayi1, sayi2, sonuc=0;
        char islem;

        System.out.println("1.Sayıyı Gir:");
        sayi1 = giris.nextDouble();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextDouble();

        System.out.println("İslemi Gir:");
        islem = giris.next().charAt(0);

        if (islem == '+')
            sonuc = sayi1 + sayi2;

        if (islem == '-')
            sonuc = sayi1 - sayi2;

        if (islem == '/')
            sonuc = sayi1 / sayi2;

        if (islem == '*')
            sonuc = sayi1 * sayi2;

        System.out.println("İşlem Sonucu="+sonuc);
    }
}
