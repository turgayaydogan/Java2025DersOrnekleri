import java.util.Scanner;

public class MenuYapisiOrnegi_V2 {
    static Scanner giris = new Scanner(System.in);

    //bu değişken sınıf içerisinde 
    //bütün metodlardan ulaşılabilir
    static int sayi=10;
    public static void main(String[] args) {
        
        boolean cikis = false;

        while (!cikis) {
            System.out.println("******ANA MENÜ******");
            System.out.println("[1] Bilgi Gir");
            System.out.println("[2] Öğrenci Listele");
            System.out.println("[3] Çıkış");
            System.out.print("Seçim Yapınız: ");
            int secim = giris.nextInt();
            giris.nextLine(); // enter karakterini temizle

            switch (secim) {
                case 1:
                    bilgiGir();
                    break;
                case 2:
                    ogrenciListele();
                    break;
                case 3:
                    cikis = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
            
        }
        System.out.println("Program sonlandırılıyor.");

    }

    public static void bilgiGir() {
        System.out.println("***Bilgi Gir***");
        System.out.println("....işlemler");
        
    }

    public static void ogrenciListele() {
        //Scanner giris = new Scanner(System.in);
        boolean cikis = false;

        while (!cikis) {
            System.out.println("[1] Hepsini Listele");
            System.out.println("[2] Sınıfa Göre Listele");
            System.out.println("[3] Cinsiyete Göre Listele");
            System.out.println("[4] Ana Menüye Dön");
            System.out.print("Seçim Yapınız: ");
            int secim = giris.nextInt();
            giris.nextLine(); // enter karakterini temizle

            switch (secim) {
                case 1:
                    System.out.println("Alt menü 1");
                    break;
                case 2:
                    System.out.println("Alt menü 2");
                    break;
                case 3:
                    System.out.println("Alt menü 3");
                    break;
                case 4:
                    cikis = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
