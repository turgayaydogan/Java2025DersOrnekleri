import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        metot1();
    }

    public static void metot1() {
        Scanner giris = new Scanner(System.in);
        int baslangic, bitis;
        int kalan;

        System.out.println("Başlangıç:");
        baslangic = giris.nextInt();

        System.out.println("Bitis:");
        bitis = giris.nextInt();

        for (int i = baslangic; i <= bitis; i++) {
            kalan = i % 5;
            if (kalan == 0)
                System.out.println(i);
        }
    }
}
