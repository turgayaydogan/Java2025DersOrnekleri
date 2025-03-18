import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int a, b, kalan;

        System.out.println("A Sayınısı Gir:");
        a = giris.nextInt();

        System.out.println("B Sayısını Gir:");
        b = giris.nextInt();

        kalan = a % b;

        if (kalan == 0)
            System.out.println("Tam Bölünür");
        else
            System.out.println("Tam BÖLÜNEMEZ");

    }
}
