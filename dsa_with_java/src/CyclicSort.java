import java.util.Arrays;
public class CyclicSort {
    static void sort(int[] arr)
    {   int len=arr.length;
        int i=0;
        while( i<len)
        {   int correct=arr[i]-1;
            if(correct!=i)
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
    }
    static void swap(int[] arr,int index,int correct)
    {
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }

    public static void main(String[] args) {
        int[] arr={7,6,1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
