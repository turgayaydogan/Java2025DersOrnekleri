import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        //HATALI KOŞUL
        Scanner giris=new Scanner(System.in);

        int girilenNot;

        System.out.println("Öğrenci Notunu Gir:");
        girilenNot = giris.nextInt();

        if(girilenNot<25){
            System.out.println("F");
        }
        if(girilenNot<45){
            System.out.println("E");
        }
        if(girilenNot<55){
            System.out.println("D");
        }
        if(girilenNot<70){
            System.out.println("C");
        }
        if(girilenNot<85){
            System.out.println("B");
        }
        if(girilenNot<=100){
            System.out.println("A");
        }
    }
}
