public class UneatenLeave {
    public static void main(String[] args) {
        int comp = 0;
        /*int n =10;
        int[] a = {2,4,5};*/
        int n=50;
        int[] a = {2, 3, 5, 4, 9, 24};
        int count =0;
            for(int j=1; j<=n;j++)
                for (int i: a)
                {
                    comp++;
                    if(j%i == 0) {
                    count++;
                    break;
                    }
                }
        System.out.println(n-count);
        System.out.println(comp);
    }
}
