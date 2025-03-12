import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi, kalan;

        System.out.println("Sayi:");
        sayi = giris.nextInt();

        kalan = sayi % 2;

        if (kalan == 0) 
            System.out.println("Çift Sayı");
        else 
            System.out.println("Sayı Tek");
        
    }
}
