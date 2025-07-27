import java.util.Arrays;
import java.util.Comparator;

public class Main3
{
    public static void main(String[] args)
    {
        Product1[] prods = {
                new Product1(1,"Books"),
                new Product1(2,"Stationary"),
                new Product1(3,"Sports"),
                new Product1(4,"Fashion"),
                new Product1(5,"Food")
        };
        int ind1 = LinearSearch.search(prods, "Books");
        System.out.println("Linear search index at: " + ind1);
        Arrays.sort(prods,Comparator.comparing(p ->p.name));
        int ind2 = BinarySearch.search(prods, "Books");
        System.out.println("Binary search index at: " + ind2);
    }
}
