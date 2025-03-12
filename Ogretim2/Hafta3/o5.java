import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sinav1, sinav2;
        
        double ortalama;

        System.out.println("1.Sınav:");
        sinav1 = giris.nextInt();

        System.out.println("2.Sinav:");
        sinav2 = giris.nextInt();

        ortalama = sinav1 * 0.4 + sinav2 * 0.6;

        System.out.println("Ortalamanız="+ortalama);
    }
}
