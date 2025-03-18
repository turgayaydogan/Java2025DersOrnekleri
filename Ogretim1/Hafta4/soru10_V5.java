import java.util.Scanner;

public class soru10_V5 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double direnc1,direnc2;
        double rES=0;
        char baglantiTipi;

        System.out.println("1.Direnç:");
        direnc1 = giris.nextDouble();

        System.out.println("2.Direnç:");
        direnc2 = giris.nextDouble();

        //giris.nextLine(); sayısal veri girişinden sonra CHAR veri girişi yapılacak ise bu satır iptal edilebilir
        
        System.out.println("Bağlantı Tipi:");
        baglantiTipi = giris.next().charAt(0);

        if(baglantiTipi=='s')
            rES = direnc1 + direnc2;
        else
            rES = (direnc1*direnc2)/(direnc1+direnc2);

        System.out.println("Res="+rES);
    }
}
