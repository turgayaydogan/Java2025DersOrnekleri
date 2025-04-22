import java.util.Arrays;

public class o9 {
    public static void main(String[] args) {
        //Arrays.equals(dizi1Adı, dizi2Adı);
        int[] sayilar1 = {3,5,7,9,3,1};
        int[] sayilar2 = {3,5,7,9,3,1};

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

        boolean sonuc=Arrays.equals(sayilar1, sayilar2);
        System.out.println(sonuc);
    }
}
