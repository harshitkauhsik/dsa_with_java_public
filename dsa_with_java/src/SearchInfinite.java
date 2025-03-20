public class SearchInfinite {
    static int findElement(int[] val,int target)
    {
        int start=0;
        int end=searchLimit(val,target);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (val[mid] == target) {
                return mid;
            }
            if (val[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
   static int searchLimit(int[] arr, int target)
    {
        int start=0;
        int end=1;

        if(target>arr[end])
        {
           end=end+(end-start+1)*2;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,12};
        System.out.println(SearchInfinite.findElement(arr,7));
    }

}
