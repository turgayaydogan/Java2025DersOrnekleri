public class o5 {
    // Çalıştığında kendisine yollanan iki adet tam sayıyı
    // toplayıp sonucunu geriye döndüren metodu yazınız.

    public static void main(String[] args) {
        double sonuc = Math.sqrt(25);
        System.out.println(sonuc);

        int toplamSonucu = sayiToplamiBul(20, 100);
        System.out.println(toplamSonucu);
    }

    public static int sayiToplamiBul(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }
}
