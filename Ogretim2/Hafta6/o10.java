import java.util.Random;

public class o10 {
    
    public static void main(String[] args) {
        Random rnd=new Random();
        int[][] notlar=new int[10][3];
        int toplam = 0;
        
        //değer atama
        for (int i = 0; i < notlar.length; i++) {//her bir satırda dolaşır
            for (int j = 0; j < notlar[i].length; j++) {//her bir satırın sutunlarında dolaşır
                notlar[i][j] =rnd.nextInt(100);
            }
        }
        //ekrana yazdırma
        for (int i = 0; i < notlar.length; i++) {//her bir satırda dolaşır
            for (int j = 0; j < notlar[i].length; j++) {//her bir satırın sutunlarında dolaşır
                System.out.print(notlar[i][j]+"\t");
            }
            System.out.println();
        }
        //her bir satırı topla
        System.out.println("*********");
        for (int i = 0; i < notlar.length; i++) {//her bir satırda dolaşır
            toplam =0;
            for (int j = 0; j < notlar[i].length; j++) {//her bir satırın sutunlarında dolaşır
                toplam = toplam + notlar[i][j];
            }
            System.out.println((i+1)+".Satır Toplamı = "+toplam);
        }

        //her bir öğrenci için 1.notun %60+2.notun %10 + 3.notun %30 hesapla ve topla
        System.out.println("*********");
        for (int i = 0; i < notlar.length; i++) {
            double ort = notlar[i][0] * 0.6 + notlar[i][1] * 0.1+notlar[i][2]*0.3;
            System.out.println("Yeni Not = " + ort);
        }
    }
}
