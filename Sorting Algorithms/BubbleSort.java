public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = { 8,6,5,4,3 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            /* 
             after setting heavy value in end
             we dont include in next iteration
            
            */ 
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }    
            }
        }

        // printing value
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
