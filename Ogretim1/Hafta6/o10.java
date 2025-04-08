import java.util.Random;

public class o10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar1 = new int[20];
        int adet = 0;

        // diziye eleman atama
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(100);
        }

        // elemanları ekrana yazdır
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("***************");

        //Dizinin elemanlarından değeri çift olanları SAY
        //Dizinin elemanlarından değeri çift olanlara +100 ekle
        for(int i=0;i<sayilar1.length;i++){
            int kalan = sayilar1[i] % 2;
            if(kalan==0){//sıradaki eleman ÇİFT ise
                adet++;//SAY
                sayilar1[i] = sayilar1[i] + 100;//EKLEME
            }
        }

        System.out.println("***************");
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
    }
}
