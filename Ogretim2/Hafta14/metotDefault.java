public class metotDefault {
    // 1. Varsayılan parametreyle çalışacak metot
    public static void selamla() {
        selamla("Ziyaretçi"); // default parametre olarak "Ziyaretçi" gönderiliyor
    }

    // 2. Gerçek metot: parametre alıyor
    public static void selamla(String isim) {
        System.out.println("Merhaba, " + isim + "!");
    }

    public static void main(String[] args) {
        selamla();
        selamla("Turgay");
    }
}
