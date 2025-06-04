import java.util.Scanner;

public class enum4 {

    enum NotHarf {
        AA, BA, BB, CC, DD, FF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Not harfini girin (AA, BA, BB, CC, DD, FF): ");
        String girilen = scanner.nextLine().toUpperCase();

        if (gecerlimiNotHarf(girilen)) {
            NotHarf notu = NotHarf.valueOf(girilen);

            System.out.println("Geçerli bir not harfi girdiniz: " + notu);

            if (notu == NotHarf.DD || notu == NotHarf.FF) {
                System.out.println("Bu not ile dersten kaldınız.");
            } else {
                System.out.println("Bu not ile dersten geçtiniz.");
            }
        } else {
            System.out.println("Geçersiz not harfi girdiniz! Lütfen AA, BA, BB, CC, DD veya FF giriniz.");
        }
    }

    public static boolean gecerlimiNotHarf(String giris) {
        for (NotHarf notDegeri : NotHarf.values()) {
            if (notDegeri.name().equalsIgnoreCase(giris)) {
                return true;
            }
        }
        return false;
    }

    public static boolean gecerlimiNotHarf_V2(String giris) {
        boolean sonuc=false;
        for (NotHarf notDegeri : NotHarf.values()) {
            if (notDegeri.name().equalsIgnoreCase(giris)) {
                sonuc = true;
            }
        }
        
        return sonuc;
    }
}
