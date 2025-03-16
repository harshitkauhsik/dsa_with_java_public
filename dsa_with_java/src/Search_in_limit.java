public class Search_in_limit {
  static int search_limited(int[]arr,int target,int start,int end)
    {   if(arr.length==0)
    {
        return -1;
    }
        for(int i=start;i<end;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] val={53,67,78,-32,-565,-43,535};
        System.out.println(search_limited(val,-32,1,5));
    }
}
