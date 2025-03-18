import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int girilenNot;

        System.out.println("Not Gir:");
        girilenNot = giris.nextInt();

        if (0 <= girilenNot && girilenNot < 25)
            System.out.println("F");
        if (25 <= girilenNot && girilenNot < 45)
            System.out.println("E");
        if (45 <= girilenNot && girilenNot < 55)
            System.out.println("D");
        if (55 <= girilenNot && girilenNot < 70)
            System.out.println("C");
        if (70 <= girilenNot && girilenNot < 85)
            System.out.println("B");
        if (85 <= girilenNot && girilenNot <=100)
            System.out.println("A");
    }
}
