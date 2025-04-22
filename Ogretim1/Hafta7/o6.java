public class o6 {
    public static void main(String[] args) {
        int[] sayilar1 = {3,5,7,9,3,1,6,2,8};

        //En Küçük Sayı Değerini Bulma
        //1) 1.eleman en küçük sayı EKS olarak kabul edilir
        //2) diğer elemanlarla kıysalanır
        //3) eğer sıradaki eleman EKS dan küçük ise artık o EKS olur, alınır
    
        int EKS = 0;

        for (int i = 0; i < sayilar1.length; i++) {
            //1)
            if(i==0)
                EKS = sayilar1[i];

            //2)
            if(sayilar1[i]<EKS)
                EKS = sayilar1[i];//3)

        }
        System.out.println(EKS);
    }
}
