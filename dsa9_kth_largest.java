import java.util.Arrays;
import java.util.Collections;
public class dsa9_kth_largest {
    static int  kth(int[] arr, int k){
        for (int i=0;i> arr.length-1;i--) {
            Arrays.sort(arr);
        }
            return arr[k - 1];

    }

    public static void main(String[] args) {
        int arr[]={2,3,53,5,4,6,12,15,63,};
        int k=3;
        System.out.println(kth(arr, k));
    }
}
