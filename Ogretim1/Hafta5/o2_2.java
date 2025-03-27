public class o2_2 {
    public static void main(String[] args) {
        int sayi = 0;
        while (sayi < 100) {

            int kalan = sayi % 2;
            if (kalan == 1)
                System.out.println(sayi);
            sayi++;
        }
    }
}
