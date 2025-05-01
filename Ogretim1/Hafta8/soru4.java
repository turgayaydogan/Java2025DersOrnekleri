import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        int bulunanSayi = enBuyukSayi();
        System.out.println(bulunanSayi);
    }

    public static int enBuyukSayi() {
        Scanner giris = new Scanner(System.in);
        int EBS = 0;
        int sayi = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Sayı:");
            sayi = giris.nextInt();
            // ilk girilen sayi
            if (i == 0)
                EBS = sayi;
            if (sayi > EBS)
                EBS = sayi;
        }

        return EBS;

    }
}
