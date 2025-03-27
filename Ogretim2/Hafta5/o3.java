import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int bitis;

        System.out.println("Bitiş değeri gir:");
        bitis = giris.nextInt();

        int sayi = 0;
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
