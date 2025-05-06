public class o6 {
    public static void main(String[] args) {
        try {
            int[] sayilar1 = { 3, 5, 7, 9, 1 };

            System.out.println(sayilar1[0]);
            System.out.println(sayilar1[1]);
            System.out.println(sayilar1[2]);
            System.out.println(sayilar1[3]);
            System.out.println(sayilar1[4]);
            System.out.println(sayilar1[5]);// HATA ALINAN SATIR

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Hata Oluştu");
        }finally{
            System.out.println("kod sonu");
        }
    }
}
