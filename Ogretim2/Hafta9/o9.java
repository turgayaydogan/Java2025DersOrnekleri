public class o9 {
    public static void main(String[] args) {
        try {
            int sayi1 = 5;
            int sayi2 = 0;
            int sonuc = sayi1 / sayi2;// HATA OLUŞTURAN SATIR

            System.out.println(sonuc);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("HATA OLUŞTU");
        }finally{
            System.out.println("kod sonu");
        }
    }
}
