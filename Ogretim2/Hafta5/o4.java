import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;

        System.out.println("Başlangıç gir:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş gir:");
        bitis = giris.nextInt();

        do{
            int kalan = baslangic % 7;
            if(kalan==0)
                System.out.println(baslangic);
            
            baslangic++;
        }while(baslangic<bitis);
    }
}
