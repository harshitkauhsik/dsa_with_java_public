public class FindInRotatedSortedArray {
    static int result(int[] arr, int target) {
        int start = 0;
        int peak = findPeak(arr, start, arr.length - 1);
        int res = binarySearch(arr, target, start, peak);
        if (res == -1) {
            res = binarySearch(arr, target, peak + 1, arr.length - 1);
        }
        return res;
    }

    static int findPeak(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start-1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,7,9,11,0,1,2,6,7};
        System.out.println("Peak index: " + findPeak(arr, 0, arr.length - 1));  // Expected: 0
        System.out.println("Target index: " + FindInRotatedSortedArray.result(arr, 7));  // Expected: 0
    }
}
