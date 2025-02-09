import java.util.HashSet;

public class dsa14_find_pair_with_sum {
    static boolean findPair(int arr[], int sum){
        //define hash set
        HashSet<Integer> set =new HashSet<>();
        for (int i=0;i< arr.length;i++){
            //sum - current element = ans , EX: arr[1,2,4,5] and sum=5 then 5-5=0 return true
            int count=sum-arr[i];
            if(set.contains(count)){
                return true;
            }

                set.add(arr[i]);


        } return  false;
    }
    public static void main(String[] args) {
        int  arr[]={11, 15, 6, 8, 9, 10};
     //traget
        int sum=16;
        if(findPair(arr,sum)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
