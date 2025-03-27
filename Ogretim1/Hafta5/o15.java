public class o15 {
    public static void main(String[] args) {
        double nufus=77;
        for(int yil=1;yil<=10;yil++){
            double artisMiktari = (nufus/100)*1.3;
            nufus=nufus+artisMiktari;
            System.out.println(yil+".sonu nufus="+nufus);
        }
    }
}
