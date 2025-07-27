public class Main2
{
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product(1,"Books",100,777.11));
        inventory.addProduct(new Product(2,"Medicine",500,999.45));
        inventory.showAllProducts();
        inventory.upadateProduct(1,114);
        inventory.deleteProduct(2);
        inventory.showAllProducts();
    }
}
