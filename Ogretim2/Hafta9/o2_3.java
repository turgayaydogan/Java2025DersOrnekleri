import java.util.Arrays;

public class o2_3 {
        //kendisine yollanan dizide
    //değeri 7 olan elemanı 50 yapsın
    //geriye yeni diziyi döndürsün/yollasın

    //dizinin ilk halini kaybetmek istemiyorsak
    public static void main(String[] args) {
        int[] sayilar1={3,5,7,9,1};

        int[] sayilar2 = diziKontrolV2(sayilar1);

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));
        
    }
    //DİZİNİN İLK HALİNE KORUMAK İÇİN
    //TEMP BİR DİZİ TANIMLADIK
    //İŞLEMLERİ TEMP DİZİDE YAPTIK
    public static int[] diziKontrolV2(int[] gelenDizi){
        int[] kopyaDizi = gelenDizi.clone();
        for (int i = 0; i < kopyaDizi.length; i++) {
            if(kopyaDizi[i]==7)
            kopyaDizi[i]=50;
        }

        return kopyaDizi;
    }
}
