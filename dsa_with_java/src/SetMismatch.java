import java.util.Arrays;
public class SetMismatch {
    static int[] findDuplicate(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i],i+1}; // duplicate found
            }
        }
        return new int[-1]; // in case no duplicate found (though in problem constraints, one duplicate always exists)
    }

  static  void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
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
        int[] arr={1,1};
        System.out.println( Arrays.toString(findDuplicate(arr)));
    }
}
