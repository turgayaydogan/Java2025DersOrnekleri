public class bitwise_1 {
    //Veri Paketinden Bilgi Ayıklama
    /*
     * Bir veri paketi içinde 16 bitlik bir sayı var. 
     * İlk 4 bit hata kodu, 
     * kalan 12 bit sıcaklık bilgisi içeriyor.
        int packet = 0b1001000001101100;
        Bu paketten hata kodunu ve sıcaklığı ayıklayın.
     */
    public static void main(String[] args) {
        int packet = 0b1001000001101100;

        int errorCode = packet >> 12; // ilk 4 bit
        int temperature = packet & 0x0FFF; // son 12 bit

        System.out.println("Hata Kodu: " + errorCode);     // 9
        System.out.println("Sıcaklık: " + temperature);     // 1644
    }
}
