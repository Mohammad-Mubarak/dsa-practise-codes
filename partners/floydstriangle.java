public class floydstriangle {
    /*

     1
     2 3
     4 5 6
     7 8 9 10
     11 12 13 14 15

     */


     public static void main(String[] args) {
        int count=1;

       for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
        System.out.println();  
       }
     }







}
