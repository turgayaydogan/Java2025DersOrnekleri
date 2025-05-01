
public class soru2 {
    public static void main(String[] args) {
        asalSayiListele(10,20);
    }

    public static void asalSayiListele(int sayi1, int sayi2) {
        //baslangıctan bitişe kadar sayıları kontrol ediyor
        for (int siradakiSayi = sayi1; siradakiSayi <= sayi2; siradakiSayi++) {
            //sıradaki sayınını Asal sayı olup olmadığını kontrol ediyor
            int bolenAdeti = 0;
            for (int i = 1; i <= siradakiSayi; i++) {
                int kalan = siradakiSayi % i;
                if (kalan == 0)
                    bolenAdeti++;
            }
            if(bolenAdeti==2)
                System.out.println(siradakiSayi);
        }

    }
}
