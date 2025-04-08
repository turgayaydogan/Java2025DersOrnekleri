import java.util.Random;

public class o7 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int[] sayilar = new int[20];

        //rastgele dizi elemanlarına değer atandı
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);
        }

        System.out.println("*************");
        //dizi elemanlarını ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("*************");
        //dizi elemanlarını ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println((i+1)+".Eleman = "+sayilar[i]);
        }
        
        System.out.println("*************");
        //dizinin her bir elemanını okumak istediğimizde
        //foreach dongusu tercih edilenilir
        for (int siradakiEleman:sayilar) {
            System.out.println(siradakiEleman);
        }
        System.out.println("*************");
        //foreach eşdeğeri aşağıdaki döngüdür
        for (int i = 0; i < sayilar.length; i++) {
            int siradakiEleman = sayilar[i];
            
            System.out.println(siradakiEleman);
        }

    }
}
