public class o3 {
    public static void main(String[] args) {
        // 0-100 arasında 7e tam bölünüp 5 e bölnemeyen sayı

        int sayi = 0;
        do {
            int kalan1 = sayi % 7;
            int kalan2 = sayi % 5;

            if (kalan1 == 0 && kalan2 != 0)
                System.out.println(sayi);

            sayi++;
        } while (sayi < 100);

    }
}
