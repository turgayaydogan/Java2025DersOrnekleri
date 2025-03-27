public class o2 {
    public static void main(String[] args) {

        int sayi = 0;
        do {

            int kalan = sayi % 2;
            if (kalan == 1)
                System.out.println(sayi);
            sayi++;
        } while (sayi < 100);
    }
}
