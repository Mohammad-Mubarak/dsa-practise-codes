package partners;

public class Diamondpattern {
    public static void main(String[] args) {
        /*
   *
  ***
 *****
*******
*******
 *****
  ***
   *

         */
        int n=4;
        for (int i=1; i<=n; i++) {
             // first print spaces
             for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
             }

             // print star
             for (int j = 1; j < i*2-1; j++) {
                 System.out.print("*");
             }

             System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            // first print spaces
            for (int j = 1; j <=n-i; j++) {
               System.out.print(" ");
            }

            // print star
            for (int j = 1; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
       }

    }
}
