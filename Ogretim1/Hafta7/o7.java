import java.util.Arrays;

public class o7 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,7,9,3,1};

        System.out.println(Arrays.toString(sayilar1));
        //belirtilen aralığı sıralamak için
        Arrays.sort(sayilar1,2,5);

        System.out.println(Arrays.toString(sayilar1));
    }
}
