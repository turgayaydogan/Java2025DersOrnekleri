public class o12_2 {
    public static void main(String[] args) {
        int carpim = 1;
        for(int i=5;i>0;i--){
            carpim = carpim * i;//carpim *= i;
        }
        System.out.println(carpim);
        //1*5
        //5*4
        //20*3
        //60*2
        //120*1
    }
}
