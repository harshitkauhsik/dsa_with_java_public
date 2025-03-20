import java.util.Scanner;
public class Celling_number {

     int cellingNumber(int []arr,int target)
        {
            int start = 0;
            int end = arr.length - 1;
            if (target > arr[end]) {
                return -1;
            }

            while (start <= end) {

                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return arr[mid];
                } else if (target < arr[mid]) {
                    end = mid - 1;


                } else {
                    start = mid + 1;
                }
            }
            return arr[start];


    }

    public static void main(String[] args) {
        Celling_number s2=new Celling_number();
         Scanner s1= new Scanner(System.in);
        System.out.println("Enter a number within Bound:");
        int val=s1.nextInt();
         int []arr={23,45,65,78,89,98,657,754};
        System.out.println(s2.cellingNumber(arr,val));
    }
}
