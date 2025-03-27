import java.util.Scanner;

public class o5_2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int baslangic, bitis;

        System.out.println("Başlangıç:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş:");
        bitis = giris.nextInt();
        for (int sayi = baslangic; sayi < bitis; sayi++) {
            int kalan1 = sayi % 8;
            int kalan2 = sayi % 5;
            if (kalan1 == 0 && kalan2 != 0)
                System.out.println(sayi);
        }

        //dikkat
        for (int i = 0; i < bitis; i++) {
            
        }
    }
}
