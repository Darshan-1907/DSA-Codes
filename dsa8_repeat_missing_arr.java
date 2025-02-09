import java.util.Arrays;

public class dsa8_repeat_missing_arr {
    public static int  repeat(int arr[]){
        int n= arr.length;
        int m=0;
        // Creating visited vector of size n+1 with
        // initial values as false. Note that array
        // values will go upto n, that is why we
        // have taken the size as n+1

        boolean[] visited= new boolean[n+1];
        int repeating = -1, missing =-1;
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[arr[i]]){
                repeating=arr[i];
            }
            else{
                visited[arr[i]]=true;
            }
        }
        for (int i=1; i<=n;i++){
            if(!visited[i]){
                missing=i;
                break;
            }
        }
        System.out.println("Repeating : " + repeating);
        System.out.println("Missing : " + missing);
        return m;
    }
    public static void main(String[] args) {
        int arr[]={3,1,3,4};
        repeat(arr);
    }
}
