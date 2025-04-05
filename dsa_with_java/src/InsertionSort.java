import java.util.Arrays;
public class InsertionSort {
    static void sorting(int[] arr)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]<arr[j])
                {
                    break;
               }

                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr={54,45,34,33,-28,27,25,-21,18,12};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
