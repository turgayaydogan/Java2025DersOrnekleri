import java.rmi.server.SocketSecurityException;
import java.util.Random;

public class o6 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int[] sayilar1 = new int[20];

        //diziye eleman atama
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = rnd.nextInt(100);
        }

        //elemanları ekrana yazdır
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }

        System.out.println("************");
        //elemanları ekrana yazdır 2
        for (int i = 0; i < sayilar1.length; i++) {
            int siradakiEleman = sayilar1[i];
            System.out.println(siradakiEleman);
        }

        System.out.println("************");
        //elemanları ekrana yazdır 3
        //dizinin her bir elemanını okumak istediğimizde bu döngü tercih edilebilir
        
        for (int siradakiEleman : sayilar1) {
            System.out.println(siradakiEleman);
        }
    }
}
