import java.util.Arrays;

public class dsa5_chocolate_distribution {
 //difinning a method choloate
        static int choloate(int arr[], int m){
            //definne an arr lenght
        int n= arr.length;
            //sort the array
        Arrays.sort(arr);
        //define a max value
        int mindif=Integer.MAX_VALUE;
        //define a for loop to fetch a each element from an array
        for(int i=0;i+m-1<n;i++){
            //define a difference
            int diff = arr[i + m - 1] - arr[i];
            //compare
            if(diff<mindif)
                mindif=diff;
        }
        return mindif;
    }
    public static void main(String[] args) {

        int arr[]= {1,3,7,4,5,0};
        int m=3;
        System.out.println(choloate(arr,m));
    }
}
