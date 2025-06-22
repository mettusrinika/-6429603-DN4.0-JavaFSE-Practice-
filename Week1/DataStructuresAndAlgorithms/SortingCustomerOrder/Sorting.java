public class Sorting
{
    public static void bubblesort(Order[] orders)
    {
        int n = orders.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(orders[j].totalPrice > orders[j + 1].totalPrice)
                {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quicksort(Order[] orders, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(orders, low, high);
            quicksort(orders, low, pi - 1);
            quicksort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high)
    {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if(orders[j].totalPrice <= pivot)
            {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return (i + 1);
    }

    public static void print(Order[] orders)
    {
        for(int i = 0; i < orders.length; i++)
        {
            System.out.print(orders[i] + " ");
        }
        System.out.println("--------------------");
    }
}
