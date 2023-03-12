public class InsertionSort {
    public static void main(String[] args) {

        int arr[]={8,6,5,4,3};
        int n=arr.length;


        // one less iteration bcz last element is already sorted
        for (int i = 0; i < n -1 ; i++) {
            int minValue =i;

            // from unsorted part so we start from i+1
            for (int j = i+1; j < n ; j++) {
                if(arr[minValue]>=arr[j]){
                    minValue=j;
                }
            }

            // swap
            int temp= arr[i];
            arr[i]=arr[minValue];
            arr[minValue]=temp;
            
        }
        

    for (int i : arr) {
        System.out.print(i+" ");
    }


    }
}
