public class bitwise_2 {
    // Şifreleme Amaçlı XOR Kullanımı

    // Bir karakter dizisini basitçe şifrelemek ve sonra çözmek istiyoruz.
    public static void main(String[] args) {
        String mesaj = "merhaba";
        char key = 'T'; // şifreleme anahtarı

        String encrypted = "";
        for (char c : mesaj.toCharArray()) {
            encrypted += (char) (c ^ key);
        }

        System.out.println("Şifreli: " + encrypted);

        // Şifre çözümü
        String decrypted = "";
        for (char c : encrypted.toCharArray()) {
            decrypted += (char) (c ^ key); // tekrar aynı işlem
        }

        System.out.println("Çözüldü: " + decrypted);
    }
}
