import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int girilenNot;

        System.out.println("Öğrenci Notunu Gir:");
        girilenNot = giris.nextInt();

        if(girilenNot<25){
            System.out.println("F");
        }
        else if(girilenNot<45){
            System.out.println("E");
        }
        else if(girilenNot<55){
            System.out.println("D");
        }
        else if(girilenNot<70){
            System.out.println("C");
        }
        else if(girilenNot<85){
            System.out.println("B");
        }
        else if(girilenNot<=100){
            System.out.println("A");
        }
    }
}
