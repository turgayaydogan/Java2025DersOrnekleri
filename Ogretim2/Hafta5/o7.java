import java.util.Random;

public class o7 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int a;

        a = rastgele.nextInt(50);//0..49 sınırlar dahil
        System.out.println(a);
        System.out.println("****");
        for(int i=0;i<10;i++){
            a = rastgele.nextInt(50);//0..49 sınırlar dahil
            System.out.println(a);
        }

    }
}
