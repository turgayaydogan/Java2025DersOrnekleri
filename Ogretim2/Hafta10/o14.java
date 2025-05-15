public class o14 {
    public static void main(String[] args) {
        String str1 = "Bugün hava çok ama çok güzel";
        int bulunanIndex = str1.indexOf("çok");
        System.out.println(bulunanIndex);

        bulunanIndex = str1.indexOf("çok", 12);
        System.out.println(bulunanIndex);

        bulunanIndex = str1.lastIndexOf("çokk");
        System.out.println(bulunanIndex);

    }
}
