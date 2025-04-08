import java.util.Random;

public class o8 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar1 = new int[20];

        // diziye eleman atama
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(100);
        }

        // elemanları ekrana yazdır
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("***************");
        // dizinin elemanlarından değeri tek olanları yazdır
        // DİKKAT
        // yukarıdaki döngüde i dizinin index değerini, yani sıra numarasını temsil
        // ederken
        // aşağıdaki döngüde i dizinin sıradaki elemanını temsil etmektedir.
        for (int i : sayilar1) {
            int kalan = i % 2;
            if (kalan == 1)
                System.out.println(i);
        }

    }
}
