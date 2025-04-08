public class o11 {
    public static void main(String[] args) {
        
        int[][] sayilar = new int[3][2];

        sayilar[0][0] = 10;
        sayilar[0][1] = 15;

        sayilar[1][0] = 20;
        sayilar[1][1] = 22;

        sayilar[2][0] = 30;
        sayilar[2][1] = 36;

        System.out.println("***************");
        //ekrana yazdırma 1
        for(int i=0;i<sayilar.length;i++){//sayilar dizisinin uzunluk = satır sayısı
            for(int j=0;j<2;j++){
                System.out.println(sayilar[i][j]);
            }
        }
        System.out.println("***************");
        //ekrana yazdırma 2
        for(int i=0;i<sayilar.length;i++){//sayilar dizisinin uzunluk = satır sayısı
            for(int j=0;j<2;j++){
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("***************");
        //ekrana yazdırma 3
        for(int i=0;i<sayilar.length;i++){//sayilar dizisinin uzunluk = satır sayısı
            for(int j=0;j<sayilar[i].length;j++){
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
