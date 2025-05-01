public class o5 {
    // Çalıştığında kendisine yollanan iki adet tam sayıyı
    // toplayıp sonucunu ekrana yazan metodu yazınız.

    public static void main(String[] args) {
        sayilariTopla(10, 20);

        sayilariTopla(50, 1500);
    }

    public static void sayilariTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }

}
