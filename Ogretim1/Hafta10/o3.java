public class o3 {
    public static void main(String[] args) {
        topla2(5, 40);
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
