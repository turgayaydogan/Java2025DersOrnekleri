import java.util.Arrays;

public class o1 {

    public static void main(String[] args) {
        
        int[] sayilar1={3,5,7,9,1};

        int[] sayilar2=diziKopyala(sayilar1);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        System.out.println("***********");

        sayilar1[0] = 100;
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        





    }

    public static int[] diziKopyala(int[] gelenDizi){
        return gelenDizi.clone();
    }
}