public class t1 {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        String c = "A";
        System.out.println(a + b);//12
        System.out.println("" + 8 + 2 + " ");//82 
        System.out.println(a + b + c);//12A
        System.out.println("" + a + b + " ");//48
        System.out.println(c + (a + b) + " ");//c+12+" " ==> A12 
    }
}