import java.util.Scanner;

public class o5_2 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[5];
        Scanner giris = new Scanner(System.in);

        //diziye veri girişi
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemanı Gir:");
            sayilar1[i] = giris.nextInt();
        }
        System.out.println("***************");
        //dizi elemanlarını ekrana yazdır
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }

    }
}
