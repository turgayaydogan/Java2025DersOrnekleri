import java.util.Random;
import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        //klavyeden girilen eleman sayısına göre
        //sayısal bir dizi tanımlanacak
        //diziye rastgele 0-100 arasında değerler atanacak
        //atanan değerler ekrana yazdırılacak

        Scanner giris=new Scanner(System.in);
        Random rnd=new Random();

        int elemanSayisi;
        int[] sayilar;

        System.out.println("Eleman Sayısı Kaç olsun:");
        elemanSayisi = giris.nextInt();
        System.out.println("******");

        sayilar = new int[elemanSayisi];
        for(int i=0;i<elemanSayisi;i++){
            sayilar[i] = rnd.nextInt(100);
            System.out.println(sayilar[i]);
        }



    }
}
