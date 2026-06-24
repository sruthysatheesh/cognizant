package week1;

import java.util.HashMap;
import java.util.Map;

class Product {
    private int productId;
    public String productName;
    private String category;

    public Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }
}

public class EcommerceManagement {
    private Product[] catalog;
    private int count;

    public EcommerceManagement() {
        this.catalog = new Product[1000];
        this.count = 0;
    }

    public void addProduct(Product p) {
        catalog[count] = p;
        count++;

        System.out.println("added: " + p.getProductId());
    }

    public int searchProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (catalog[i].productName == name) {
                System.out.println("found " + name + " at position " + (i + 1));
                return 0;
            }
        }
        System.out.println("not found");
        return -1;
    }
}

class MainApp {
    public static void main(String[] args) {

        EcommerceManagement shop = new EcommerceManagement();

        Product p1 = new Product(101, "banana", "fruit");
        Product p2 = new Product(102, "apple", "fruit");
        Product p3 = new Product(103, "carrot", "vegetable");

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);

        shop.searchProduct("carrot");
    }
}