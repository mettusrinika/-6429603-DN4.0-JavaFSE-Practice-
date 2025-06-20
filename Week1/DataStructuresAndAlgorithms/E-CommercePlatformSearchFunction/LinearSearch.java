public class LinearSearch
{
    public static int search(Product1[] arr, String target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].name.equals(target))
                {
                return i;
                }
        }
        return -1;
    }
}
