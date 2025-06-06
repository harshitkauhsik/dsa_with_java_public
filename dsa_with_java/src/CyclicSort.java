import java.util.Arrays;
import java.util.ArrayList;

public class CyclicSort {
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // check bounds and avoid infinite swap on duplicates
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int index, int correct) {
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
