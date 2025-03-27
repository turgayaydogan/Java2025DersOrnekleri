public class o11 {
    public static void main(String[] args) {
        int sayac = 0;// adet
        for (int i = 0; i <= 1000; i++) {
            int kalan1 = i % 5;
            int kalan2 = i % 2;
            if(kalan1==0 && kalan2!=0)
                sayac++;
        }
        System.out.println(sayac);
    }
}
