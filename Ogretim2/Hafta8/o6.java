public class o6 {
    //Çalıştığında kendisine yollanan iki adet tam sayıyı 
    //toplayıp sonucunu geriye döndüren metodu yazınız.

    public static void main(String[] args) {
        double sonuc = Math.sqrt(25);
        System.out.println(sonuc);

        int sonuc2 = sayiToplamiBul(20, 100);
        System.out.println(sonuc2);//test için ekrana yazdırıyorum

    }

    public static int sayiToplamiBul(int sayi1,int sayi2){
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }

    

}
