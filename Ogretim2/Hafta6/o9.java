public class o9 {
    public static void main(String[] args) {
        int[][] sayilar = new int[2][3];
        int toplam = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sayilar[i][j]);
            }
        }
        sayilar[0][0] = 11;
        sayilar[0][1] = 12;
        sayilar[0][2] = 13;

        sayilar[1][0] = 21;
        sayilar[1][1] = 22;
        sayilar[1][2] = 23;

        System.out.println("**********");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sayilar[i][j]);
            }
        }

        System.out.println("**********");
        for (int i = 0; i < 2; i++) {//her bir satırda dolaşır
            for (int j = 0; j < 3; j++) {//her bir satırın sutunlarında dolaşır
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }
        //her bir elemanı topla
        System.out.println("**********");
        for (int i = 0; i < 2; i++) {//her bir satırda dolaşır
            for (int j = 0; j < 3; j++) {//her bir satırın sutunlarında dolaşır
                toplam = toplam +sayilar[i][j];
            }
        }
        System.out.println("Toplam="+toplam);

        //her bir elemanı topla
        //sayilar.length =  satır sayısını verir
        //sayilar[0].length = 1.satırn eleman sayısı
        //                  = 1.satırın sutun sayısı
        System.out.println("2**********");
        toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {//her bir satırda dolaşır
            for (int j = 0; j < sayilar[i].length; j++) {//her bir satırın sutunlarında dolaşır
                toplam = toplam +sayilar[i][j];
            }
        }
        System.out.println("Toplam="+toplam);


    }
}
