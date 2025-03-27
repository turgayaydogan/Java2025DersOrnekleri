import java.util.Scanner;

public class o6_3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;

        System.out.println("Başlangıç gir:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş gir:");
        bitis = giris.nextInt();
        //sıradaki sayımız i değişkeninde
        //her seferinde sıradaki sayının
        //8 ve 5 e bölümünden kalanı buluyoruz
        //sıradaki sayıyı arttırarak bitişe varmaya çalışıyoruz
        //i++;
        for (int i = baslangic; i<bitis; i++) {
            int kalan1 = i % 8;
            int kalan2 = i % 5;
            if(kalan1==0 && kalan2!=0)
                System.out.println(i);
        }
    }
}
