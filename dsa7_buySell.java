public class dsa7_buySell {
    public static int  profit(int arr[])
    {
        int n= arr.length;
        int res=0;
        for(int i=0;i< n-1;i++){
            for(int j=i+1;j<n;j++){
                res = Math.max(res ,arr[j]-arr[i]);
            }

        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={5,6,3,9,2,4,1};
        System.out.println(profit(arr));

    }
}
