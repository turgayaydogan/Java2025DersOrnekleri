import java.util.Arrays;

public class o12 {
    public static void main(String[] args) {
        //Arrays.fill(diziAdı,atanacakDeger);

        int[] sayilar1=new int[10];
        System.out.println(Arrays.toString(sayilar1));
        Arrays.fill(sayilar1, 5);
        
        System.out.println("********");
        System.out.println(Arrays.toString(sayilar1));

    }
}
