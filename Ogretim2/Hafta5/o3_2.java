import java.util.Scanner;

public class o3_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int bitis,sayi;

        System.out.println("Bitiş değeri gir:");
        bitis = giris.nextInt();

        sayi = 0;//veya sayi=0 ifadesi 6.satırda olabilir yani int bitis,sayi=0; olabilir
        do {
            // sıradaki sayı 7 nin katımı
            int kalan = sayi % 7;
            if (kalan == 0) {// sıradaki sayı 7 nin katı ise
                System.out.println(sayi);
            }
            sayi++;
        } while (sayi < bitis);
    }
}
