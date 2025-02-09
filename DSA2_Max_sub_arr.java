public class DSA2_Max_sub_arr {

    public static int maxsub(int arr[]){
    int max=arr[0];
for(int i=0; i< arr.length;i++) {
    int currentsum = 0;


    for (int j = i; j < arr.length; j++) {
int sum=currentsum+arr[j];
 max= Math.max(max,sum);
    }
}
return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,};

        System.out.println(maxsub(arr));
    }
}
