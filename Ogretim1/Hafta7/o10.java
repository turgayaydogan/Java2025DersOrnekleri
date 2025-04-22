import java.util.Arrays;

public class o10 {
    public static void main(String[] args) {
        // Arrays.copyOf(orijinalDizi,kopyalanacakElemanSayısı);
        int[] sayilar1 = { 3, 5, 7, 9, 3, 1 };
        int[] sayilar2;

        sayilar2 = Arrays.copyOf(sayilar1, 3);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        System.out.println("**********");

        sayilar2 = Arrays.copyOf(sayilar1, 10);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

    }

}
