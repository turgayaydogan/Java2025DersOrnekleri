import java.util.Scanner;

public class soru6_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,kalan;

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        kalan = sayi % 7;

        if(kalan==0){
            System.out.println("Tam bölünür");
        }
        if(kalan!=0){
            System.out.println("Tam BÖLÜNEMEZ");
        }
    }
}
