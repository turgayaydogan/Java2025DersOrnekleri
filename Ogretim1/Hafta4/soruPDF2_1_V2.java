import java.util.Scanner;

public class soruPDF2_1_V2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double boy, yas, kilo;
        char cinsiyet;
        double idealKilo, fark;

        System.out.println("Boy:");
        boy = giris.nextDouble();

        System.out.println("Yaş:");
        yas = giris.nextDouble();

        System.out.println("Kilonuz:");
        kilo = giris.nextDouble();

        System.out.println("Cinsiyet (E/K):");
        cinsiyet = giris.next().charAt(0);

        if (cinsiyet == 'E')
            idealKilo = (boy - 100 + yas / 10) * 0.9;
        else
            idealKilo = (boy - 100 + yas / 10) * 0.8;
        
        System.out.println("İdeal Kilonuz="+idealKilo);

        if(kilo>idealKilo){
            fark = kilo-idealKilo;
            System.out.println(fark+ " kilo vermelisiniz.:(");
        }
        else if(kilo<idealKilo){
            fark = idealKilo - kilo;
            System.out.println(fark + " kilo almalısın");
        }
        else {// veya else if(kilo==idealKilo)
            System.out.println("Tebrikler, ideal kilodasınız.");
        }
    }
}
