import java.util.ArrayList;


public class FindAllMissing {

    static ArrayList<Integer> findMissing(int[] arr) {
        sort(arr);
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                nums.add(i);
            }
        }
        return nums;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // check bounds to avoid ArrayIndexOutOfBoundsException
            if (correct >= 0 && correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8};
        System.out.println("Missing numbers: " + findMissing(arr));
    }
}
