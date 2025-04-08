import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar1 = new int[5];

        System.out.println("Değer Gir:");
        sayilar1[0] = giris.nextInt();

        System.out.println("Değer Gir:");
        sayilar1[1] = giris.nextInt();

        System.out.println("Değer Gir:");
        sayilar1[2] = giris.nextInt();

        System.out.println("Değer Gir:");
        sayilar1[3] = giris.nextInt();

        System.out.println("Değer Gir:");
        sayilar1[4] = giris.nextInt();

        System.out.println("**************");
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println(sayilar1[3]);
        System.out.println(sayilar1[4]);
    }
}
