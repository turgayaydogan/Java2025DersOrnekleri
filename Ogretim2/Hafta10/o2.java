public class o2 {
    public static void main(String[] args) {
        try {
            topla1();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Bir hata oluştu");
        }
    }

    public static void topla1(){
        throw new ArithmeticException();
    }

    
}
