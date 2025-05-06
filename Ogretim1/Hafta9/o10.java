import java.util.ArrayList;
import java.util.List;

public class o10 {
    public static void main(String[] args) {
        List<Integer> sayilarListesi = new ArrayList<Integer>();

        sayilarListesi.add(10);
        sayilarListesi.add(15);

        System.out.println(sayilarListesi.get(0));
        System.out.println(sayilarListesi.get(1));
        System.out.println("******");
        for (int i = 0; i < sayilarListesi.size(); i++) {
            System.out.println(sayilarListesi.get(i));
        }

        System.out.println("*******");

        sayilarListesi.set(0, 20);//index 0 olan elemanı 20 yap

        System.out.println(sayilarListesi.get(0));

        System.out.println("********");
        sayilarListesi.remove(1);//index 1 olan elamnı siler
        for (Integer eleman : sayilarListesi) {
            System.out.println(eleman);
        }

        System.out.println("*******");
        sayilarListesi.clear();//elemanları sildi
        for (Integer eleman : sayilarListesi) {
            System.out.println(eleman);
        }



    }
}
