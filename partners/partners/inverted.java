package partners ;

public class inverted {
       /*          
            *
          * *
        * * *
      * * * *  

     */

     public static void main(String[] args) {
        
        int n=10;

        for (int i = 1; i <=n; i++) {
            // print space 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "); 
            }

            // print starts
            for (int j = 1; j <=i; j++) {
                   System.out.print("*");
            }
            System.out.println();
        }









     }
}
