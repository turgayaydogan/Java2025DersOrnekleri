import java.util.Scanner;

public class o16 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1=0, sayi2=0, sonuc=0;
        String islem;

        System.out.println("1.Sayıyı Gir:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextInt();

        giris.nextLine();

        System.out.println("İslemi Gir:");
        islem = giris.nextLine();

        if (islem.equals("+"))
            sonuc = sayi1 + sayi2;

        if (islem.equals("-"))
            sonuc = sayi1 - sayi2;

        if (islem.equals("/"))
            sonuc = sayi1 / sayi2;

        if (islem.equals("*"))
            sonuc = sayi1 * sayi2;

        System.out.println("İşlem Sonucu="+sonuc);
    }
}
