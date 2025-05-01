import java.util.Scanner;

public class o5_2 {
    public static void main(String[] args) {
        sayilariTopla(10, 20);

        sayilariTopla(50, 1500);
        System.out.println("**********");
        //klavyeden veri girişi yapılsa
        //klavyeden girilen değerler
        //metoda nasıl yollanır?

        Scanner giris=new Scanner(System.in);
        int s1,s2;

        System.out.println("1.Sayı:");
        s1=giris.nextInt();

        System.out.println("2.Sayı:");
        s2=giris.nextInt();

        sayilariTopla(s1,s2);

    }

    public static void sayilariTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }
}
