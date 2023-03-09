package partners;

public class hallowRectangle {
      /* 
                
            * * * * * 
            *       * 
            *       *
            * * * * *
     */
    public static void main(String[] args) {
        int row =5;
        int col=5;
             // we are just printing boundries 
              for (int i = 1; i <= row; i++) {
                 for (int j = 1; j <=col; j++) {
                    // first row and last row than we print start
                    // first column and last column of boundry 
                    // than we print start otherwise we print empty space
                    if(i==1 || i == row || j==1 || j == col){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                           }
                 }
                System.out.println();
              }
    }
}
