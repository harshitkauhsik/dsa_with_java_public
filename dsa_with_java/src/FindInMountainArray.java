public class FindInMountainArray {
    static int findOutThePeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }

    static int elementSearch(int[] var, int target) {
        int start = 0;
        int end = findOutThePeak(var);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (var[mid] == target) {
                return mid;
            }
            if (var[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int answerElement(int[] arr, int target) {
        int ans = elementSearch(arr, target);
        if (ans >= 0) {
            return ans;
        } else if (ans < 0) {
            int start = findOutThePeak(arr) + 1;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,13,9,8,7,5,4,2};
        System.out.println(answerElement(arr,5));
    }
}




