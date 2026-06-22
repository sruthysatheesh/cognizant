import java.util.HashMap;
import java.util.Map;

class Inventory{
    private Map<Integer, Product> productMap;

    public Inventory(){
        this.productMap = new HashMap<>();
    }

    public void addToInventory(Product p){
        productMap.put(p.getProductId(), p);
        System.out.println("Added " + p.getProductId());
    }
}

class Product {
    private int productId;
    private String productName;
    private float quantity;
    private float price;

    public Product(int id, String newproduct, float quantity, float price){
        this.productId = id;
        this.productName = newproduct;
        this.quantity=quantity;
        this.price=price;
    }

    public int getProductId(){
        return productId;
    }
}


class MainApp{
    public static void main(String[] args){
        Inventory myInventory = new Inventory();

        Product p1 = new Product(101,"Cherries",50,25);
        myInventory.addToInventory(p1);
    }
}
