import java.util.ArrayList;
import java.util.List;

public class o16 {
    public static void main(String[] args) {
        
        List<Integer> sayiListesi=new ArrayList<Integer>();

        sayiListesi.add(10);
        sayiListesi.add(20);

        System.out.println(sayiListesi.get(0));
        System.out.println(sayiListesi.get(1));

        System.out.println("********");
        for (int i = 0; i < sayiListesi.size(); i++) {
            System.out.println(sayiListesi.get(i));
        }
        System.out.println("***********");
        for (Integer eleman : sayiListesi) {
            System.out.println(eleman);
        }
        System.out.println("*********");
        sayiListesi.set(0, 500);
        for (Integer eleman : sayiListesi) {
            System.out.println(eleman);
        }
        System.out.println("*********");
        sayiListesi.remove(0);
        for (Integer eleman : sayiListesi) {
            System.out.println(eleman);
        }

        sayiListesi.clear();//listesi temizler


        
    }
}
