import java.util.Arrays;

public class o2_2 {
    //kendisine yollanan dizide
    //değeri 7 olan elemanı 50 yapsın
    //geriye yeni diziyi döndürsün/yollasın

    //dizinin ilk halini kaybetmek istemiyorsak
    public static void main(String[] args) {
        int[] sayilar1={3,5,7,9,1};

        int[] sayilar2 = diziKontrol(sayilar1.clone());

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        
    }

    public static int[] diziKontrol(int[] gelenDizi){
        for (int i = 0; i < gelenDizi.length; i++) {
            if(gelenDizi[i]==7)
                gelenDizi[i]=50;
        }

        return gelenDizi;
    }
}
