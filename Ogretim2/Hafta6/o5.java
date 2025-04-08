import java.util.Scanner;

public class o5 {
    
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int[] sayilar1 = new int[5];

        for(int i=0;i<5;i++){
            System.out.println("Değeri Gir:");
            sayilar1[i] = giris.nextInt();
        }
        //ekrana yazdırma
        System.out.println("*********");
        for(int i=0;i<=5;i++){//
            System.out.println(sayilar1[i]);//i = 5 olduğunda HATA oluşur index numarasına dikkat etmeliyiz
        }
    }
}
