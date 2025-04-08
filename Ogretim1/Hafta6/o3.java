public class o3 {
    public static void main(String[] args) {
        int[] sayilar1=new int[5];
        int sayi1 = 10;
        int sayi2;

        System.out.println(sayilar1[0]);
        
        //bu satırda çalışma zamanında hata verir, dizinin 6.elemanına ulaşmaya çalışıyor 
        System.out.println(sayilar1[5]);
    }
}
