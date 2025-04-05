import java.util.Arrays;
public class SelectionSort {
    static int sort(int[] arr)
    {  int maxIndex=0;
        if (arr.length < 2) {
            System.out.println("Insufficient elements to sort!");
            return 0;
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
             maxIndex = i; // Assume the first element is the largest

            // Find the largest element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[maxIndex])
                {
                    maxIndex = j;
                }
            }

            // Swap the found max element with the last element in the unsorted portion
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 33, 10, 14, 80, 9, 7, 4, 13, 20};
        sort(arr);
        System.out.println(Arrays.toString(arr));// Print sorted array in descending order
        System.out.println(sort(arr));
    }
}
