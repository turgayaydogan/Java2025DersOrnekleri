public class o9 {
    public static void main(String[] args) {
        try {
            int sayi1 = 5;
            int sayi2 = 0;
            int sonuc = sayi1 / sayi2;// HATA OLUŞABİLECEK SATIR
            System.out.println(sonuc);

            int[] sayilar1 = { 3, 5, 7, 9, 1 };

            System.out.println(sayilar1[0]);
            System.out.println(sayilar1[1]);
            System.out.println(sayilar1[2]);
            System.out.println(sayilar1[3]);
            System.out.println(sayilar1[4]);
            System.out.println(sayilar1[5]);// HATA OLUŞABİLECEK SATIR

        } catch (ArithmeticException e1) {
            // TODO: handle exception
            System.out.println("Aritmatik hesaplama ile ilgili bir hata oluştu");
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            // TODO: handle exception
            System.out.println("Dizi elemanına ulaşırken bir hata oluştu");
        }
    }
}
