public class o4 {
    public static void main(String[] args) {
        int[] sayilar1=new int[5];
        int[] sayilar2=new int[5];
        int sayi1 = 10;
        int sayi2;

        sayilar1[0] = sayi1;
        System.out.println(sayilar1[0]);

        sayi2 = sayilar1[0];
        System.out.println(sayi2);

        //sayilar1 dizisinin 1.elemanının değeri
        //sayilar2 dizisinin 1.elemanına atanıyor
        sayilar2[0] = sayilar1[0];

        System.out.println("***********");
        sayi1 = sayi1 + 20;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);


        
        
    }
}
