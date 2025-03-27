public class o2 {
    public static void main(String[] args) {
        int sayi = 0;
        do {
            // sıradaki sayı tek mi bulmalıyız
            int kalan = sayi % 2;
            if (kalan == 1) {// sıradaki sayı tek ise
                System.out.println(sayi);
            }
            sayi++;
        } while (sayi < 1000);
    }
}
