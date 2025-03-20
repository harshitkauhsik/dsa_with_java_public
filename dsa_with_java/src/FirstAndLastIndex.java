public class FirstAndLastIndex {

    // Function to find the first and last occurrence calling here the other method
    static int[] indexFound(int[] arr, int target) {
        int[] result = {-1, -1};  // Initialize with -1 for not found
        result[0] = foundElement(arr, target, true);  // Find first occurrence
        result[1] = foundElement(arr, target, false); // Find last occurrence
        return result;
    }

    // Binary search to find first or last occurrence
    static int foundElement(int[] arr, int target, boolean isFirst ) {
        //isFirst is a type of boolean variable which is flag it will control weather it should search first element or last
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
            {
                result = mid;
                // If searching for the first occurrence, move left
                if (isFirst)
                {
                    end = mid - 1;
                }
                // If searching for the last occurrence, move right
                else
                {
                    start = mid + 1;
                }
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return result;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 12, 12, 12, 20,20,20,20,20};
        int target = 1;

        int[] result = indexFound(arr, target);
        System.out.println( result[0]  +" "+ result[1]);
    }
}
