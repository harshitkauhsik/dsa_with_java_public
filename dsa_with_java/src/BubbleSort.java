import java.util.Arrays;
public class BubbleSort {
    static void bubbleSort(int[] arr)
    {   boolean swapped;
        if(arr.length<2)
        {
            System.out.println("Elements are insufficient to sort!");
            System.exit(0);
        }
        else
            for(int i=0;i<arr.length-1;i++)
            {   swapped=false;
                for(int j=1;j<arr.length-i;j++)
                {
                    if(arr[j-1]>arr[j])
                    {
                        int temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                        swapped=true;
                    }
                }
                if(!swapped)
                {
                    break;
                }
            }


    }

    public static void main(String[] args) {
       // int arr[]={90,2,0,20,12,34,56,18,34,23,37,49,45,10,9,8,14,16,39,40,56,12,50,13,49,1};
       int arr[]={90,89,80,79,-70,69,65,60,-56,50,108,110,-112,90,78,45};
      //  int[] arr={1,2,3,4,5,6};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
