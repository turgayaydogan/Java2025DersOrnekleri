import java.util.Random;

public class o12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] sayilar = new int[10][3];
        int toplam = 0;
        int satirinToplami = 0;

        // diziye rastgele değer ata
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sayilar[i][j] = rnd.nextInt(100);
            }
        }

        // ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + "\t");
            }
            System.out.println();
        }

        // dizi elemanlarını topla
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam = toplam + sayilar[i][j];
            }
        }
        System.out.println("Dizi Eleman Toplamı=" + toplam);
        // her bir satırın elemanlarını topla
        for (int i = 0; i < sayilar.length; i++) {
            satirinToplami = 0;
            for (int j = 0; j < sayilar[i].length; j++) {
                satirinToplami = satirinToplami + sayilar[i][j];
            }
            System.out.println((i + 1) + ".Satır Toplamı = " + satirinToplami);
        }
        System.out.println("***************");
        // her bir satırın
        // 1.elamanın %60 + 2.elemanın %10 + 3.elemanın %30 hesapla
        for (int i = 0; i < sayilar.length; i++) {
            double ort = sayilar[i][0] * 0.6 + sayilar[i][1] * 0.1 + sayilar[i][2] * 0.3;
            System.out.println((i+1)+".Öğrenci Yeni Notu = "+ort);
        }

    }
}
