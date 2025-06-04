public class threadOrnek1 {
    public static void main(String[] args) {
        Thread sayiThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Sayı: " + i);
                try {
                    Thread.sleep(500); // Yarım saniye bekle
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread harfThread = new Thread(() -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Harf: " + c);
                try {
                    Thread.sleep(700); // 0.7 saniye bekle
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        sayiThread.start();
        harfThread.start();
    }
}
