import java.util.Arrays;

public class o11 {
    public static void main(String[] args) {
        // Arrays.copyOfRange(orijinalDizi,baslangıcİlkElemanIndexNo,
        // bitisSonElemanIndexNo);
        int[] sayilar1 = { 3, 5, 7, 9, 3, 1 };
        int[] sayilar2;

        sayilar2 = Arrays.copyOfRange(sayilar1, 1, 4);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        System.out.println("**********");

        sayilar2 = Arrays.copyOfRange(sayilar1, 3, 10);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

    }
}
