import java.util.Arrays;
import java.util.ArrayList;
public class MissingInCS {
    static void found(int[] nums)
    {
        int i=0;
        int len=nums.length;
        while(i<len)
        {
            int real=nums[i];
            if(real!=i)
            {
                swap(nums,real,i);
            }

            i++;
        }
    }
    static void swap(int[] nums,int real,int i)
    {
        int temp=nums[real];
      nums[real]=nums[i];
      nums[i]=temp;
    }
    static int search(int[] nums)
    {   int len=nums.length;
        int i=0;
        found(nums);
        while(i<len)
        {
            if (nums[i] != i)
            {
                return i;
            }
            i++;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr={};
        System.out.println(search(arr));
        System.out.println(Arrays.toString(arr));
      //  System.out.println(arr.length);
    }
}
