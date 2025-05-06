public class o14_2 {
    public static void main(String[] args) {
        try {
            int[] sayilar1 = { 1, 3, 5, 7, 9 };

            System.out.println(sayilar1[0]);
            System.out.println(sayilar1[1]);
            System.out.println(sayilar1[2]);
            System.out.println(sayilar1[3]);
            System.out.println(sayilar1[4]);
            System.out.println(sayilar1[0]/0);// HATA OLUŞTURACAK SATIR

        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Hata oluştu");
        }
    }
}
