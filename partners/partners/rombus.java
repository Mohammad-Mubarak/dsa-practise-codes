package partners;
public class rombus {
    public static void main(String[] args) {
           /*
    *****
   ***** 
  *****  
 *****   
*****  
           */


        int n = 5;
        for (int i = 1; i <= n; i++) {

            // first space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // second stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }
}