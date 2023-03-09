package partners;
public class zero1triangle {
    /*

     1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1

     */
    public static void main(String[] args) {
        
        int n=5;
        for (int i=0; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                // if even just print 1
                // if odd print 0
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println();

        }


    }
}
