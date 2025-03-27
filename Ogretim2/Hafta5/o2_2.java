public class o2_2 {
    public static void main(String[] args) {
        //HATALI-kodlar derlenir ama mantıksal hata var
        int sayi = 0;
        do {
            // sıradaki sayı tek mi bulmalıyız
            int kalan = sayi % 2;
            if (kalan == 1) {// sıradaki sayı tek ise
                System.out.println(sayi);
                sayi++;
            }
            //sonraki sayıya ulaşamayız. sadece yazdırma işlemi şarta bağlı olmalı
        } while (sayi < 1000);
    }
}
