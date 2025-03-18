import java.util.Scanner;

public class soru10_V4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double direnc1, direnc2;
        double rES = 0;
        String baglantiTipi;

        System.out.println("1.Direnç:");
        direnc1 = giris.nextDouble();

        System.out.println("2.Direnç:");
        direnc2 = giris.nextDouble();

        giris.nextLine();

        System.out.println("Bağlantı Tipi:");
        baglantiTipi = giris.nextLine();

        if (baglantiTipi.equals("s"))
            rES = direnc1 + direnc2;
        else
            rES = (direnc1 * direnc2) / (direnc1 + direnc2);

        System.out.println("Res=" + rES);
    }
}
