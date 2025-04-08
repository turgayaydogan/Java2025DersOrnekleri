import java.util.Random;

public class o8_2 {
    public static void main(String[] args) {
        //dizi elemanlarından değeri tek olanları sıra numarası ile ekrana yazdır
        Random rnd = new Random();
        int[] sayilar1 = new int[20];

        // diziye eleman atama
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(100);
        }

        // elemanları ekrana yazdır AMA sıra numarası ile birlikte
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println((i + 1) + ".Eleman = " + sayilar1[i]);
        }
        System.out.println("***************");
        for (int i = 0; i < sayilar1.length; i++) {
            int kalan = sayilar1[i] % 2;
            if (kalan == 1)
                System.out.println((i + 1) + ".Eleman = " + sayilar1[i]);
        }
    }
}
