import java.util.Scanner;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class o7 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kalan;

        System.out.println("Sayi:");
        sayi = giris.nextInt();

        kalan = sayi % 2;
        
        if(kalan==0){
            System.out.println("Çift Sayı");
        }

        if(kalan==1){
            System.out.println("Sayı Tek");
        }
        

    }
}
