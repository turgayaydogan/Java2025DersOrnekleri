import java.util.Scanner;

public class o18 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, sonuc;
        char islem;

        System.out.println("1.Sayıyı Gir:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextInt();

        System.out.println("İslemi Gir:");
        islem = giris.next().charAt(0);

        if (islem == '+')
            sonuc = sayi1 + sayi2;
        else if (islem == '-')
            sonuc = sayi1 - sayi2;
        else if (islem == '/')
            sonuc = sayi1 / sayi2;
        else 
            sonuc = sayi1 * sayi2;

        System.out.println("İşlem Sonucu="+sonuc);
    }
}
