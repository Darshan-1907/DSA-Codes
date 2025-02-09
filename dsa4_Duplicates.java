public class dsa4_Duplicates {
    public static boolean duplicate(int arr[]){
        int Dub=arr[0];
        for(int i=0;i<arr.length;i++){
        for (int j=i;j< arr.length;j++){
           if(arr[i]==arr[j])
               return true;

        }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,2,3};
        System.out.println(""+duplicate(arr));
    }
}
