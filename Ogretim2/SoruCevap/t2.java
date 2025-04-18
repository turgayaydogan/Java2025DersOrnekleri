import java.util.Random;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        
        Scanner giris=new Scanner(System.in);
        Random rnd=new Random();
        int secim;
        int bilgisayarSecim;
        int kullaniciPuan=0,bilgisayarPuani=0;

        int adet =0;

        do {
            System.out.print("Secim:");
            secim = giris.nextInt();

            bilgisayarSecim = 1 + rnd.nextInt(6);//1-6

            if(secim>bilgisayarSecim){
                kullaniciPuan++;
                System.out.println("Sonuc: Sen kazandın, Puanlar Bilgisyar:"+bilgisayarPuani+" Kullanıcı:"+kullaniciPuan);
            }
            if(secim<bilgisayarSecim){
                bilgisayarPuani++;
                System.out.println("Sonuc: Bilgisayar kazandı, Puanlar Bilgisyar:"+bilgisayarPuani+" Kullanıcı:"+kullaniciPuan);
            }
            if(secim==bilgisayarSecim){
                System.out.println("Sonuc: Bebabere, Puanlar Bilgisyar:"+bilgisayarPuani+" Kullanıcı:"+kullaniciPuan);
            }
            adet++;

        } while (adet<3 || kullaniciPuan==bilgisayarPuani);
        //adet            =3
        //bilgisayarPuani =1
        //kullaniciPuan   =1


        
    }
}
