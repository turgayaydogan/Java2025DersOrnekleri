public class o5 {
    public static void main(String[] args) {
        int faktoriyelSonucu = faktoriyel(5);
    }
    // kendini çağıran metot

    public static int faktoriyel(int sayi) {
        int sonuc = 0;

        if (sayi == 1)
            sonuc = 1;
        else
            sonuc = sayi * faktoriyel(sayi - 1);

        return sonuc;
    }
}
