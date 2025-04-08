public class o6 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[5];
        sayilar1[0] = 10;
        sayilar1[1] = 20;
        sayilar1[2] = 30;
        sayilar1[3] = 40;
        sayilar1[4] = 50;
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println(sayilar1[3]);
        System.out.println(sayilar1[4]);
        //Aşağıdaki satırda HATA var, olmayan elemana ulaşmaya çalışıyor
        System.out.println(sayilar1[5]);

        
    }
}
