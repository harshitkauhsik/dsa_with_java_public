public class Search_smallest {
    static int search(int[]arr)
    {   if(arr.length==0)
        return -1;
        int min=0;
        min=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {

            if(min>arr[i+1])
            {
                min=arr[i+1];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]num={54,64,-64,-76,23,76,9,-54,-3532453};
        System.out.println(search(num));
    }
}
