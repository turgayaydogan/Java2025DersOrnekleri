public class soru3 {
    public static void main(String[] args) {
        double islemSonucu= hesapla(10, 20, '/');
        System.out.println(islemSonucu);
    }

    public static double hesapla(double sayi1, double sayi2, char islem) {
        double sonuc = 0;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
        }

        return sonuc;
    }
}
