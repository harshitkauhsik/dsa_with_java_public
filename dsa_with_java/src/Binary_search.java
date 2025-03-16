public class Binary_search {

    static int binarySearch(int arr[],int target)
    {  int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Binary_search b1=new Binary_search();
        int []arr={-323,-302,0,43,78,90,100,120,149};
        System.out.println(Binary_search.binarySearch(arr,-323));
    }
}
