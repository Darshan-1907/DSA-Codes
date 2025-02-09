public class dsa6_roatetd_sorted_rray {
    static int  binarySearch(int arr[], int low, int high, int x){
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            return mid;
            if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    static int findPivot(int[] arr, int lo, int hi) {
        while (lo < hi) {

            // The current subarray is already sorted,
            // the minimum is at the low index
            if (arr[lo] <= arr[hi])
                return lo;

            int mid = (lo + hi) / 2;

            // The right half is not sorted. So
            // the minimum element must be in the
            // right half
            if (arr[mid] > arr[hi])
                lo = mid + 1;

                // The right half is sorted. Note that in
                // this case, we do not change high to mid - 1
                // but keep it to mid. The mid element
                // itself can be the smallest
            else
                hi = mid;
        }

        return lo;
    }

    // Searches an element key in a pivoted
    // sorted array arr of size n
    static int search(int[] arr, int key) {
        int n = arr.length;
        int pivot = findPivot(arr, 0, n - 1);

        // If we found a pivot, then first compare with pivot
        // and then search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;

        // If the minimum element is present at index
        // 0, then the whole array is sorted
        if (pivot == 0)
            return binarySearch(arr, 0, n - 1, key);

        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,7,9,2};
        int key=3;
        System.out.println(search(arr, key));
    }
}
