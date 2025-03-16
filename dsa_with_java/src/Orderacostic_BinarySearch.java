class OrderAgnosticBinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] ascendingArr = {1, 3, 5, 7, 9, 11, 13};
        int[] descendingArr = {98, 78, 56, 45, 23, 13, 9, 8, 7};

        System.out.println("Target found at index: " + binarySearch(ascendingArr, 7));  // Output: 3
        System.out.println("Target found at index: " + binarySearch(descendingArr, 7)); // Output: 8
    }
}
