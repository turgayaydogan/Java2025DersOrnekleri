import java.util.Random;
import java.util.Scanner;

public class o1 {

    public static void main(String[] args) {
        //klavyeden eleman sayısı girilecek
        //rastgele değer atanıp ekrana yazdırılacak
        Scanner giris=new Scanner(System.in);
        Random rnd=new Random();

        int elemanSayisi;
        int[] sayilar;

        System.out.println("Eleman Sayını Belirle:");
        elemanSayisi = giris.nextInt();

        sayilar=new int[elemanSayisi];
        System.out.println("********");
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(50);
            System.out.println(sayilar[i]);
        }



    }
}