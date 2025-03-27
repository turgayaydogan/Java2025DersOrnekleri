import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi, bitis;

        System.out.println("Bitiş Değeri Gir:");
        bitis = giris.nextInt();

        sayi = 0;
        do {
            int kalan = sayi % 7;
            if (kalan == 0)
                System.out.println(sayi);

            sayi++;
        } while (sayi < bitis);
        
    }
}
