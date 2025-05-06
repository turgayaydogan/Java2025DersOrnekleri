public class o4 {

    public static void main(String[] args) {
        sayilariTopla(1);
        sayilariTopla(1,2,9,6,50);
        sayilariTopla(3,5,7);
    }

    public static void sayilariTopla(int... sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println(toplam);
    }
}
