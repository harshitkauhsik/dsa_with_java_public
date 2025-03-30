import java.util.Arrays;
public class BubbleSort {
    static void bubbleSort(int[] arr)
    {
        if(arr.length<2)
        {
            System.out.println("Elements are insufficient to sort!");
            System.exit(0);
        }
        else
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=1;j<arr.length-i-1;j++)
                {
                    if(arr[j-1]>arr[j])
                    {
                        int temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

    }

    public static void main(String[] args) {
        int arr[]={2,0,20,12,34,56,18,34,23,37,49,45,10,9,8,14,16};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
