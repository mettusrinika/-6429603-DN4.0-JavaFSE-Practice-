import java.util.HashMap;
public class Inventory
{
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product p)
    {
        inventory.put(p.id, p);
    }
    public void upadateProduct(int id, int newQuantity)
    {
        if(inventory.containsKey(id))
        {
            inventory.get(id).quantity = newQuantity;
        }
    }
    public void deleteProduct(int id)
    {
        inventory.remove(id);
    }
    public void showAllProducts()
    {
        for(Product p : inventory.values())
        {
            System.out.println(p);
        }
    }
}
