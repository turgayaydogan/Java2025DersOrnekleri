import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int baslangic,bitis;

        System.out.println("Başlangıç:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş:");
        bitis = giris.nextInt();

        do{
            int kalan1 = baslangic % 8;
            int kalan2 = baslangic % 5;

            if(kalan1==0 && kalan2!=0)
                System.out.println(baslangic);
            
            baslangic++;
        }while(baslangic<bitis);

    }
}
