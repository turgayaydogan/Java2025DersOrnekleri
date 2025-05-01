public class o4_2 {
    public static void main(String[] args) {
        sayilariYaz();
        sayilariYaz();

        for (int i = 0; i < 5; i++) {
            sayilariYaz();
        }
    }

    public static void sayilariYaz() {
        for (int i = 1; i <= 10; i++) {
            int kalan = i % 2;
            if (kalan == 1)
                System.out.println(i);
        }
    }
}
