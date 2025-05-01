public class o4 {
    //Çalıştığında kendisine yollanan iki adet tam sayıyı 
    //toplayıp sonucunu ekrana yazan metodu yazınız.

    public static void main(String[] args) {
        sayilariTopla(20,30);
        

        int sayi1=50;
        int sayi2=100;

        sayilariTopla(sayi1, sayi2);
    }

    public static void sayilariTopla(int sayi1,int sayi2){
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }
}
