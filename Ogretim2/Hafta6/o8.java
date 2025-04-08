import java.util.Random;

public class o8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar = new int[20];
        int adet = 0;
        int toplam = 0;

        // rastgele dizi elemanlarına değer atandı
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);
        }

        System.out.println("*************");
        // dizi elemanlarını ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        System.out.println("**********");
        // dizi elemanlarından değeri TEK olanları yazdır
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 1)// sıaradaki eleman tek ise
                System.out.println(sayilar[i]);
        }
        System.out.println("**********");
        // dizi elemanlarından değeri ÇİFT olanları say ve topla
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 0) {// sıaradaki eleman çift ise
                adet++;
                toplam = toplam + sayilar[i];
            }
        }
        System.out.println(adet);
        System.out.println(toplam);
        System.out.println("**********");
        // degeri 50 den büyük olanlara +100 ekle
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 50)
                sayilar[i] = sayilar[i] + 100;
        }
        //ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

    }
}
