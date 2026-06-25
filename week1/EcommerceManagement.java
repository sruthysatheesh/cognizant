import java.util.*;

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
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

        System.out.println("added: " + p.getProductName());
    }

    public int LinSearchProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (catalog[i].getProductName().equals(name)) {
                System.out.println("found " + name + " at position " + (i + 1));
                return 0;
            }
        }
        System.out.println("not found");
        return -1;
    }

    public int BinSearchProduct(String name) {
        Arrays.sort(catalog, 0, count, (p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));

        int low = 0;
        int high = count - 1;

        int mid = (high + low) / 2;

        while (low <= high) {
            if (catalog[mid].getProductName().equals(name)) {
                System.out.println("found " + name + " at position " + (mid + 1));
                return 0;
            }

            else if (name.compareTo(catalog[mid].getProductName()) < 0) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }

            mid = (low + high) / 2;
        }
        return -1;
    }
}

class MainApp {
    public static void main(String[] args) {

        EcommerceManagement shop = new EcommerceManagement();

        Product p1 = new Product(101, "banana", "fruit");
        Product p2 = new Product(102, "apple", "fruit");
        Product p3 = new Product(103, "carrot", "vegetable");
        Product p4 = new Product(104, "Guava", "Fruit");
        Product p5 = new Product(105, "Pineapple", "Fruit");
        Product p6 = new Product(106, "Potato", "Vegetable");

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);
        shop.addProduct(p4);
        shop.addProduct(p5);
        shop.addProduct(p6);

        System.out.println("LINEAR SEARCH");
        shop.LinSearchProduct("carrot");

        System.out.println("BINARY SEARCH");
        shop.BinSearchProduct("carrot");

    }
}