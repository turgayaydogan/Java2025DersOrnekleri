import java.util.Arrays;

public class o2 {
    //kendizine yollanan dizide
    //dizi elemanlarından değeri 7 olanı 50 yapıp 
    //yeni diziyi geriye döndüren bir metot yazınız
    public static void main(String[] args) {
        int[] sayilar1 ={3,5,7,9,1};

        System.out.println(Arrays.toString(sayilar1));
        //DİKKAT
        //bu şekilde parametreye dizi yolladığımızda
        //eğer metot içerisinde dizi içeriği değişiyorsa
        //parametre olarak gelen dizinin orjinal halide 
        //değişmiş olur.
        int[] sayilar2 = diziKontrol(sayilar1);
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("*********");
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("**********");
        sayilar1 =new int[]{3,5,7,9,1};
        int[] sayilar3 = diziKontrol(sayilar1.clone());
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar3));




    }

    public static int[] diziKontrol(int[] gelenDizi){
        for (int i = 0; i < gelenDizi.length; i++) {
            if(gelenDizi[i]==7)
                gelenDizi[i]=50;
        }
        return gelenDizi;
    }

}
