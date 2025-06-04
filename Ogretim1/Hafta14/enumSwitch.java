public class enumSwitch {
    public static void main(String[] args) {
        enum Gun {
            PAZARTESI,
            SALI,
            CARSAMBA,
            PERSEMBE,
            CUMA,
            CUMARTESI,
            PAZAR
        }

        Gun gun=Gun.PERSEMBE;

        int sayisalKarsilik = switch (gun) {
            case PAZARTESI, CUMA, PAZAR -> 9;
            case SALI -> 4;
            default -> {
                String s = gun.toString(); // Enum sabitinin ismini alır (örn: "CARSAMBA")
                int sonuc = s.length(); // Harf sayısını hesaplar
                yield sonuc;
            }
        };

        System.out.println(sayisalKarsilik);
    }
}
