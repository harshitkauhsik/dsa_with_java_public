import java.util.Arrays;

public class MissingInCS {

    static void found(int[] nums) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int correct = nums[i];
            // Only swap if value is within [0, len-1] and not already at the right place
            if (correct >= 0 && correct < len && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    static int search(int[] nums) {
        found(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i; // first mismatch is the missing number
            }
        }
        return nums.length; // all numbers 0 to n-1 are present
    }

    public static void main(String[] args) {
        int[] arr = {0,-1,2,4,3};
        System.out.println(search(arr)); // Output: 0 (0 is missing)
    }
}
