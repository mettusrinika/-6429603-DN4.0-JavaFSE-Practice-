public class Main8
{
    public static void main(String[] args)
    {
        Order[] orders = {
                new Order(1,"ABC",12899),
                new Order(2,"DEF",23172),
                new Order(3,"GHI",5342),
        };
        Order[] orders2 = orders.clone();
        System.out.println("Original Orders: ");
        Sorting.print(orders);

        Sorting.bubblesort(orders);
        System.out.println("Bubble Orders: ");
        Sorting.print(orders);

        Sorting.quicksort(orders2, 0, orders2.length-1);
        System.out.println("Quick Orders: ");
        Sorting.print(orders2);
    }
}
