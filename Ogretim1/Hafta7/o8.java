import java.util.Arrays;

public class o8 {
    public static void main(String[] args) {
        //Arrays.binarySearch(diziAdı, aranacakDeger);
        int[] sayilar1 = {3,5,7,9,3,1};

        System.out.println(Arrays.toString(sayilar1));

        Arrays.sort(sayilar1);
        int bulunanIndex = Arrays.binarySearch(sayilar1, 10);
        System.out.println(bulunanIndex);
        
        bulunanIndex = Arrays.binarySearch(sayilar1, 1);
        System.out.println(bulunanIndex);

        bulunanIndex = Arrays.binarySearch(sayilar1, 3);
        System.out.println(bulunanIndex);
    }
}
