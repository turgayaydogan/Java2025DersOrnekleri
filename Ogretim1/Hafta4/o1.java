import java.util.Scanner;

public class o1 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1 = 0, sayi2 = 0, sonuc = 0;
        String islem;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        giris.nextLine();

        System.out.println("İşlem:");
        islem = giris.nextLine();

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "/":
                sonuc = sayi1 / sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            default:
                System.out.println("Tanımsız islem...");
                break;
        }

        System.out.println("Sonuc=" + sonuc);

    }
}