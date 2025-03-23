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
          else
          {
              end=mid;
          }
      }
      return start;

  }

    public static void main(String[] args) {
        int arr[]={25,11,9,8,7,6,5,4,3};
        System.out.println(FindPeak.searchPeak(arr));
    }
}
