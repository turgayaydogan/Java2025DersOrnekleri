import java.util.Arrays;

public class o4 {
    public static void main(String[] args) {
        //DİKKAT
        //REFERANS TİPİ


        int[] sayilar1={1,3,5,7};
        
        int[] sayilar2= sayilar1;

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("*********");
        //sadece sayilar1 de değişiklik yapılmasına rağmen sayilar2 de değişti
        //bunu düzeltmek adına clone() metodu kullanılır
        sayilar1[0]=100;
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));



    }
}
