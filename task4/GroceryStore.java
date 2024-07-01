package finalexam.task4;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GroceryStore implements LegalEntity {
    public final String name;
    public String vatNumber;
    public String address;
    public final List<Product> products = new ArrayList<>();

    public GroceryStore(String name, String vatNumber, String address) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean deleteProduct(Product product) {
        for (Product p : products) {
            if (p.equals(product)) {
                products.remove(p);
                return true;
            }
        }

        return false;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void saveState() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task4/products.txt"));
            for (Product p : products) {
                writer.write(p.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadState() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("task4/products.txt"));
            products.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                products.add(new Product(parts[0], Double.parseDouble(parts[1])));
            }
            reader.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
