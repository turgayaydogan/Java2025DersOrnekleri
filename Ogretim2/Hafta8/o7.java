import java.util.Random;

public class o7 {
    //metot çalıştığında 0-100 arasında rastgele sayı tutsun
    //ve tuttuğu bu sayıyı geri döndürsün
    public static void main(String[] args) {
        //test işlemi için
        //sayıyı tutup tumadığını kontrol ediyoruz
        int sonuc = sayiTut();
        System.out.println(sonuc);

        for (int i = 0; i < 10; i++) {
            System.out.println(sayiTut());
        }

    }
     public static int sayiTut(){
        Random rnd=new Random();
        int sayi;
        sayi=rnd.nextInt(100);//0-100 arasında sayı tuttu
        return sayi;
     }
}
