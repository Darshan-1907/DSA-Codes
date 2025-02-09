import java.util.Arrays;
public class DSA1min_max {
    public static int min(int arr[], int n){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i] <min){
                min = arr[i];
            }

        }
        return min;

    }
    public static int max(int arr[], int n){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,23,10,44,51};
        System.out.println("Array is"+ arr);
        int n=arr.length;
        System.out.println("min eelemt is" + min(arr,n));
        System.out.println("max element is" + max(arr, n));

    }
}
