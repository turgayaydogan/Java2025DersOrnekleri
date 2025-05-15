public class o4 {
    public static void main(String[] args) {
        try {
            topla2(25, 40);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Bir hata oluştu");
        }
    }

    public static void topla1(){
        throw new ArithmeticException();
    }

    public static void topla2(int sayi1, int sayi2) {
        if (sayi1 > 10)
            throw new ArithmeticException();
        else
            System.out.println(sayi1 + sayi2);
    }
}
