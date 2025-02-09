import java.util.Arrays;

public class DSA11product_of_array {
   //intialize int method
    public static int[] product(int[] arr){
        //declare n;
        int n= arr.length;
        //create an array of res to store the multiplication
        int res[]=new int[n];
        //fill array using Arrays.fill and it fill into res with 1
        Arrays.fill(res,1);
        //use for loop to iterate each element
        for (int i=0;i<n;i++){
            //inner lloop for except i current element
            for (int j=0;j<n;j++){

                if(i!=j){
                    //multi of arr j w and store into res array
                    res[i] *= arr[j];
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,6};
        //
        int res[]=product(arr);
        //store res array into val
        for (int val :res){
            System.out.println(val);
        }
    }
}
