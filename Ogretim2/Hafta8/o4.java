public class o4 {
    // Çalıştığında ekrana 1-10 arasındaki sayıları
    // alt alta yazan metodu yazınız.

    public static void main(String[] args) {
        sayilariYaz();
        sayilariYaz();

        for(int i=0;i<5;i++){
            sayilariYaz();
        }
    }

    public static void sayilariYaz() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
