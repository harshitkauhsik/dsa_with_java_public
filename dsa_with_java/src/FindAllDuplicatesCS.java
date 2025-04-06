import java.util.ArrayList;

public class FindAllDuplicatesCS
{
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

    static ArrayList<Integer> searchDuplicate(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        {
            sort(arr);
            int start = arr.length / 2;
            while (start < arr.length) {
                if (arr[start] != start + 1) {
                    nums.add(arr[start]);
                }
                start++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,5,2,6,7,8,1};
        System.out.println(searchDuplicate(arr));
    }
}
