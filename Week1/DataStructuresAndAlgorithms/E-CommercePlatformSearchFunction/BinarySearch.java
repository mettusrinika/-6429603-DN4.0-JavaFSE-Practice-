import java.util.*;
public class BinarySearch
{
    public static int search(Product1[] arr, String target)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            int cmp = arr[mid].name.compareTo(target);
            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
