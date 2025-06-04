public class bitwise_3 {
    //RGB Renk Ayrıştırma

    //Bir renk int color = 0xFF3366 (hex formatında) olarak verilmiş. 
    //RGB bileşenlerini ayırmak istiyoruz.
    public static void main(String[] args) {
        int renkRGB = 0xFF3366; // Hex: FF (red), 33 (green), 66 (blue)

        int red = (renkRGB >> 16) & 0xFF; 
        // en sağdan 16 biti at, sadece sol baştaki FF kalır.
        // 11111111 00110011 01100110  →  shift >> 16 →
        //00000000 00000000 11111111  → yani: 0x000000FF

        //0x000000FF & 0xFF ==> maskeleme
        //0x000000FF    → 00000000 00000000 11111111
        //0xFF          → 00000000 00000000 11111111
        //AND           ____________________________
        //sonuc           00000000 00000000 11111111
        //Böylece sadece kırmızı (red) değeri kalır, diğerleri sıfırlanmış olur.
        /*
         * Maskeleme, bir sayı içindeki sadece istediğin bitleri almak için kullanılır. 
         * Bunu yaparken & (AND) operatörünü kullanırız.
         */
        
        int green = (renkRGB >> 8) & 0xFF;
        int blue = renkRGB & 0xFF;

        System.out.println("Red: " + red);     // 255
        System.out.println("Green: " + green); // 51
        System.out.println("Blue: " + blue);   // 102
    }
}
