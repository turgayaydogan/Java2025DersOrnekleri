public class o12_2 {

    public static void main(String[] args) {
        // HATALI NEDEN?
        // ASAL SAYI
        // 1 ve kendisine bölünebilen sayılara ASAL sayı denir
        // ozaman tam bölen adeti 2 dir
        int adet = 0;
        int sayi = 8;

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                adet++;

            if (adet == 2)
                System.out.println("Sayı ASAL sayıdır");
            else
                System.out.println("Asal değildir");
        }

    }
}
