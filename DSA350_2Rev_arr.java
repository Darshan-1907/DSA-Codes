public class DSA350_2Rev_arr {
   static void reverse(int arr[]){

            int left=0, right= arr.length-1;
            while(left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

        }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
reverse(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        }
    }

