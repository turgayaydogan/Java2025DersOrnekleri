import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar1 = new int[5];

        for(int i=0;i<5;i++){
            System.out.println("Değeri Gir:");
            sayilar1[i] = giris.nextInt();
        }
        //ekrana yazdırma
        System.out.println("*********");
        for(int i=0;i<sayilar1.length;i++){//sayilar1.length=dizinin satır sayısı bilgisini verir
            System.out.println(sayilar1[i]);
        }
        
    }
}
