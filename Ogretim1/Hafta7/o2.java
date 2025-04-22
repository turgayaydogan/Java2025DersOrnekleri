public class o2 {
    public static void main(String[] args) {
        int[][] duzensizDizi = new int[4][];
        duzensizDizi[0] = new int[2];
        duzensizDizi[1] = new int[4];
        duzensizDizi[2] = new int[1];
        duzensizDizi[3] = new int[3];
        //2.forda HATA var. duzensizDizi[0] ==> duzensizDizi[i]
        for (int i = 0; i < duzensizDizi.length; i++) {
            for (int j = 0; j < duzensizDizi[0].length; j++) {
                System.out.print(duzensizDizi[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
