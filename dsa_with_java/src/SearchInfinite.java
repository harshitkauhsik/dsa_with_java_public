 class SearchInfinite {
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
            else if (val[mid] < target) {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
   static int searchLimit(int[] arr, int target)
    {
        int start=0;
        int end=1;
       while(target>arr[end]) {
           end = end*2;
           if(arr[end]>target)
           {
               end=end-1;
           }
       }
        return end;
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,12,20,34,56,78,90,124,234,345,456,567,678,789,980,990,999,1000,1002,1003,1005,1008,2356,4567,8977};
        System.out.println(SearchInfinite.findElement(arr,1002));
    }

}
