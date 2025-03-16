import java.util.Scanner;

public class Bubble_sorting {
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
     int sort_Array()
     {   int k=0;
         for(int i=0;i<size;i++)
         {
             for(int j=0;j<size-i-1;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     k=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=k;
                 }

             }
         }
         System.out.println(" ");
         System.out.println(" After sorting ");
         for(int i=0;i<size;i++)
         {

             System.out.print(arr[i]+"->");
         }
         return 0;
     }
     public static void main(String[] args)
    {
        Bubble_sorting b1=new Bubble_sorting();
        b1.insert_Arr();
        b1.display_Array();
        b1.sort_Array();

    }

}
