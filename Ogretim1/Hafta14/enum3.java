public class enum3 {
    public enum KullaniciRol {
        ADMIN, OGRETMEN, OGRENCI
    }

    public static void main(String[] args) {
        KullaniciRol rol1 = KullaniciRol.ADMIN;
        yetkiyiGoster(rol1);
    }

    public static void yetkiyiGoster(KullaniciRol rol) {
        if (rol == KullaniciRol.ADMIN) {
            System.out.println("Tüm yetkilere sahip.");
        } else if (rol == KullaniciRol.OGRETMEN) {
            System.out.println("Sadece ders işlemlerine erişebilir.");
        } else {
            System.out.println("Dersleri görüntüleyebilir.");
        }
    }
}
