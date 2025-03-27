import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int carpan,adim;

        System.out.println("Çarpan:");
        carpan = giris.nextInt();

        System.out.println("Adım:");
        adim = giris.nextInt();

        for(int i=1;i<=adim;i++){
            int sonuc = i * carpan;
            System.out.println(i+"x"+carpan+"="+sonuc);
        }
    }
}
