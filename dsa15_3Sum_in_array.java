import java.util.HashSet;

public class dsa15_3Sum_in_array {
    static boolean sum1(int arr[], int sum) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j =i+1; j < n ; j++) {
                int sum3 = sum - arr[i] - arr[j];
                if (set.contains(sum3)) {
                    return true;
                }
                set.add(arr[j]);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 0;
        if (sum1(arr, sum)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}