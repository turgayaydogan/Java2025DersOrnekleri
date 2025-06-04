public class enum2 {
    public static void main(String[] args) {
       enum OgrenciDurumu {
            AKTIF, MEZUN, AYRILDI
        } 

        OgrenciDurumu ogr1=OgrenciDurumu.AKTIF;

        switch (ogr1) {
            case AKTIF:
                System.out.println("Öğrenci Aktif");
                break;
            case MEZUN:
                System.out.println("Öğrenci Mezun olmuş");
                break;
            case AYRILDI:
                System.out.println("Öğrenci Ayrılmış");
                break;
        
            default:
                break;
        }
    }
}
