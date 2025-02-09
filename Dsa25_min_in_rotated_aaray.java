public class Dsa25_min_in_rotated_aaray {
    static int min(int arr[]){
        int n= arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
            //use math.min  to find minimum number from sorted or roteted   array
            min =Math.min(arr[i], min);
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,0};
        System.out.println(min(arr));
    }
}
