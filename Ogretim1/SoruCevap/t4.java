public class t4 {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 5; i++) {//ilk satır    //i=5    x=14
            x += i;
            if (i % 2 == 0) {
                continue;
            }
            x += 2;
        }
        //çıkış
        System.out.println("x: " + x);
    }
}
