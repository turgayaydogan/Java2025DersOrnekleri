public class enum1 {

    public static void main(String[] args) {
        enum OgrenciDurumu {
            AKTIF, MEZUN, AYRILDI
        }

        OgrenciDurumu ogr1=OgrenciDurumu.AKTIF;

        System.out.println(ogr1);
        System.out.println(OgrenciDurumu.AKTIF);
        
    }
}