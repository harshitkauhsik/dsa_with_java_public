import java.util.Scanner;

public class Selection_sort {
    int arr[];
    int size;
    Scanner s1 = new Scanner(System.in);
    int insert_Arr() {
        size=s1.nextInt();
        arr= new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+(i+1)+" element ");
            arr[i]=s1.nextInt();
        }
        return 0;
    }
    int display_Array()
    {
        System.out.println(" before sorting element of array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"->");
        }
        return 0;
    }
    int sort()
    {    int temp=0;
        int min=0;
        int i=0;
        for( i=0;i<size-1;i++)
        {
            min=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min])
                {
                    temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println(" After sorting ");
        for(i=0;i<size;i++)
        {

            System.out.print(arr[i]+"->");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Selection_sort s1=new Selection_sort();
        s1.insert_Arr();
        s1.display_Array();
        s1.sort();
    }

}
