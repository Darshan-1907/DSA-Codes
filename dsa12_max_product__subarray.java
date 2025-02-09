import java.util.*;
public class dsa12_max_product__subarray {
    //initialize method  of product to calculate max product
    static int product(int arr[]){
        //intialize result with arr index 0
        int result=arr[0];
        //outer for loop to iterate each elemtn from array
        for (int i=0;i< arr.length;i++)
        {
            // declare mul variable as 1
            int mul=1;
            // inner loop for to calulate the multiplication and store the max product of array into result
            for(int j=i;j< arr.length;j++){
                mul *=arr[j];
                //math . max function used to calculate the max product
                result=Math.max(result,mul);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {-2,6,-3,-10,0,2};
        System.out.println( product(arr)) ;

    }
}
