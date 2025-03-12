import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kalan;

        System.out.println("Sayı Gir:");
        sayi = giris.nextInt();

        kalan = sayi % 2;

        if(kalan==0)
            System.out.println("çift");
        
        if(kalan==1)
            System.out.println("tek");
        
    }
}
