public class FindPeak {
  static int searchPeak(int[] arr)
  {
      int start=0;
      int end=arr.length-1;
      while(start<end)
      {
          int mid=start+(end-start)/2;
          if(arr[mid]<arr[mid+1])
          {
              start=mid+1;
          }
          else if(arr[mid]>arr[mid+1])
          {
              end=mid;
          }
      }
      return start;

  }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,12,14,18,19,20,11,9,8,7,6,5,4,3,2,1};
        System.out.println(FindPeak.searchPeak(arr));
    }
}
