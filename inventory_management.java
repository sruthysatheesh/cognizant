import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<Integer, Product> productMap;

    public Inventory() {
        this.productMap = new HashMap<>();
    }

    public void addToInventory(Product p) {
        productMap.put(p.getProductId(), p);
        System.out.println("Added " + p.getProductId());

        viewProducts();
    }

    public void viewProducts() {
        if (productMap.isEmpty()) {
            System.out.println("nothing to see here");
        }

        else {
            System.out.println("current inventory:\n");

            for (Product p : productMap.values()) {
                System.out.println(p.toString());
            }
        }
    }

    public void updateProduct(Product p) {
        if (productMap.containsKey(p.getProductId())) {
            productMap.put(p.getProductId(), p);
            System.out.println("updated " + p.getProductId());
        } else {
            System.out.println("not found " + p.getProductId());
        }

        viewProducts();
    }

    public void deleteProduct(Product p) {
        productMap.remove(p.getProductId());
        System.out.println("deleted");

        viewProducts();
    }
}

class Product {
    private int productId;
    private String productName;
    private float quantity;
    private float price;

    public Product(int id, String newproduct, float quantity, float price) {
        this.productId = id;
        this.productName = newproduct;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }
}

class MainApp {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();

        Product p1 = new Product(102, "blueberries", 50, 25);
        myInventory.addToInventory(p1);

        Product p2 = new Product(101, "cherries", 50, 25);
        myInventory.addToInventory(p2);

        Product p3 = new Product(103, "strawberries", 50, 25);
        myInventory.addToInventory(p3);

        myInventory.deleteProduct(p1);
        myInventory.deleteProduct(p2);
        myInventory.deleteProduct(p3);
    }
}
