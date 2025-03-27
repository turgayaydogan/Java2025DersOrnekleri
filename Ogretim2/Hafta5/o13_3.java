public class o13_3 {
    public static void main(String[] args) {
        //1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların adetini bulan programı yazınız.
        //HATALI SONUÇ VERİR
        int sayac=0;//adet=0;

        for(int i = 1;i<=1000;i++){
            int kalan1 = i % 5;
            int kalan2 = i % 2;
            if(kalan1==0 && kalan2!=0){
                sayac++;
                System.out.println(sayac);
            }
        }
    }
}
