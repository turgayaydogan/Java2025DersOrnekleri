public class o6 {
    public static void main(String[] args) {
        boolean deger1 = 5 > 6 || 8 < 9 || 9 < 10;

        boolean deger2 = 5 > 6 || 80 < 9 || 90 < 9;

        boolean deger3 = 5 > 6 && 8 < 9 && 9 < 20;

        boolean deger4 = 5 > 6 || 8 < 9 && 9 < 9;

        boolean deger5 = 5 > 6 && 8 < 9 || 9 < 10;

        System.out.println(deger1);
        System.out.println(deger2);
        System.out.println(deger3);
        System.out.println(deger4);
        System.out.println(deger5);

    }
}
