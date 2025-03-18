import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int girilenNot;

        System.out.println("Öğrenci Notunu Gir:");
        girilenNot = giris.nextInt();

        if(0<=girilenNot && girilenNot<25){
            System.out.println("F");
        }
        else if(25<=girilenNot && girilenNot<45){
            System.out.println("E");
        }
        else if(45<=girilenNot && girilenNot<55){
            System.out.println("D");
        }
        else if(55<=girilenNot && girilenNot<70){
            System.out.println("C");
        }
        else if(70<=girilenNot && girilenNot<85){
            System.out.println("B");
        }
        else if(85<=girilenNot && girilenNot<=100){
            System.out.println("A");
        }
    
    }
}
