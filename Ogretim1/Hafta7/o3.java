import java.sql.Array;
import java.util.Arrays;

public class o3 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,7,9,3,1};
        
        int[] sayilar2 = sayilar1.clone();

        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("*****");
        for (int i = 0; i < sayilar2.length; i++) {
            System.out.println(sayilar2[i]);
        }
        System.out.println("**********");

        sayilar1[0]=100;

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
    }
}
