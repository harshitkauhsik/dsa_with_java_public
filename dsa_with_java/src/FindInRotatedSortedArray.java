public class FindInRotatedSortedArray {
    static int result(int[] arr,int target)
    {   int start=0;
        int peak=findPeak(arr,start,arr.length-1);
        int res=binarySearch(arr,target,start,peak);
        if(res==-1)
        {
            res=binarySearch(arr,target,peak+1,arr.length-1);
        }
        return res;
    }

    static int findPeak(int[] arr,int start,int end)
    {

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={15,2,3,4,5,6,7,11};
        System.out.println(findPeak(arr,0,arr.length-1));
        System.out.println(FindInRotatedSortedArray.result(arr,15));
    }

}
