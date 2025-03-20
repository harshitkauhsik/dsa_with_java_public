public class FloorNumber {
   static int floorNumber(int []arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            else if (target < arr[mid])
            {
                end = mid - 1;

            }
            else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
       int arr[]={34,56,78,98,100,129,139,456};
        System.out.println(FloorNumber.floorNumber(arr,65));

    }
}
