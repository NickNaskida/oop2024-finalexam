package finalexam.task4;

public class GrocerStoreTester {
    public static void main(String[] args) {
        GroceryStore store = new GroceryStore("Store", "123", "Address");
        Product product1 = new Product("Product1", 10.0);
        Product product2 = new Product("Product2", 20.0);
        Product product3 = new Product("Product3", 30.0);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        System.out.println("Products:");
        for (Product p : store.getProducts()) {
            System.out.println(p);
        }

        store.deleteProduct(product2);

        System.out.println("Products after deleting product2:");
        for (Product p : store.getProducts()) {
            System.out.println(p);
        }

        store.saveState();

        System.out.println("Products after saving state:");
        for (Product p : store.getProducts()) {
            System.out.println(p);
        }

        System.out.println("Products after loading state:");

        GroceryStore store2 = new GroceryStore("Store2", "456", "Address2");
        store2.loadState();

        for (Product p : store2.getProducts()) {
            System.out.println(p);
        }

    }
}
