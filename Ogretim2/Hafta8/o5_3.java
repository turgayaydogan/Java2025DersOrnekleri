import java.util.Scanner;

public class o5_3 {
    public static void main(String[] args) {
        sayilariTopla(10, 20);

        sayilariTopla(50, 1500);
        System.out.println("**********");
        //klavyeden veri girişi yapılsa
        //klavyeden girilen değerler
        //metoda nasıl yollanır?

        Scanner giris=new Scanner(System.in);
        int sayi1,sayi2;

        System.out.println("1.Sayı:");
        sayi1=giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2=giris.nextInt();

        sayilariTopla(sayi1,sayi2);

    }

    public static void sayilariTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    } 
}
