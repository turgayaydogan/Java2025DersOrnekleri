import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[5];
        Scanner giris=new Scanner(System.in);

        System.out.println("1.Elemanı gir:");
        sayilar1[0]=giris.nextInt();

        System.out.println("2.Elemanı gir:");
        sayilar1[1]=giris.nextInt();

        System.out.println("3.Elemanı gir:");
        sayilar1[2]=giris.nextInt();

        System.out.println("4.Elemanı gir:");
        sayilar1[3]=giris.nextInt();

        System.out.println("5.Elemanı gir:");
        sayilar1[4]=giris.nextInt();

        System.out.println("*******************");
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println(sayilar1[3]);
        System.out.println(sayilar1[4]);
    }
}
