import java.util.Scanner;

public class enum5 {

    public enum NotHarf {
        AA(4.0),
        BA(3.5),
        BB(3.0),
        CC(2.0),
        DD(1.0),
        FF(0.0);

        private final double puan;

        NotHarf(double puan) {
            this.puan = puan;
        }

        public double getPuan() {
            return puan;
        }

        // Girilen string değer geçerli mi?
        public static boolean isValid(String input) {
            for (NotHarf notDegeri : NotHarf.values()) {
                if (notDegeri.name().equalsIgnoreCase(input)) {
                    return true;
                }
            }
            return false;
        }

        // String olarak girilen harf notunu enum'a ve puana çevirme
        public static NotHarf fromString(String input) {
            return NotHarf.valueOf(input.toUpperCase());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Not harfini girin (AA, BA, BB, CC, DD, FF): ");
        String giris = scanner.nextLine().toUpperCase();

        if (NotHarf.isValid(giris)) {
            NotHarf notu = NotHarf.fromString(giris);
            System.out.println("Seçilen not: " + notu);
            System.out.println("Sayısal karşılığı: " + notu.getPuan());
        } else {
            System.out.println("Geçersiz not harfi girdiniz!");
        }

    }
}
