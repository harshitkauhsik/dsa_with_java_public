class NextGreaterCharacter {
    static char nextSmallestGreater(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        // Circular case: if target is greater than or equal to the largest element
        if (target >= arr[end]) {
            return arr[0];
        }

        // Binary Search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {
        char arr[] = {'c', 'g', 'k', 'l', 'o', 'r'};
        System.out.println(NextGreaterCharacter.nextSmallestGreater(arr, 'i')); // Output: c
    }
}
