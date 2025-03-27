import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;

        System.out.println("Başlangıç gir:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş gir:");
        bitis = giris.nextInt();
        //sıradaki sayımız baslangic değişkeninde
        //her seferinde sıradaki sayının
        //8 ve 5 e bölümünden kalanı buluyoruz
        //sıradaki sayıyı arttırarak bitişe varmaya çalışıyoruz
        //baslangic++;
        do{
            int kalan1 = baslangic % 8;
            int kalan2 = baslangic % 5;
            if(kalan1==0 && kalan2!=0)
                System.out.println(baslangic);
            
            baslangic++;
        }while(baslangic<bitis);
    }
}
