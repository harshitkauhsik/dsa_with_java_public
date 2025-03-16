public class Linear_search {
        static int linearsearch(int[]arr,int target)
        {   if(arr.length==0)
           {
               return -1;
           }
            for(int i=0;i<arr.length;i++)
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
        System.out.println(linearsearch(val,-32));
    }
    }

