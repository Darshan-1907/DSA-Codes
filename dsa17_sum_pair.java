import java.util.HashSet;

public class dsa17_sum_pair {
    static boolean sum(int arr[], int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            int sum=n-arr[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,2,6,7};
        int n=11;
        if(sum(arr,n)){
            System.out.println("true");
                    }
        else {
            System.out.println("false");
        }
    }
}
