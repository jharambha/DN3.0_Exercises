import java.util.HashMap;

public class Inventory {
    private HashMap<String, Products> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Products product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        Products product = products.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public void displayProducts() {
        for (Products product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Products p1 = new Products("P001", "Product 1", 10, 50.0);
        Products p2 = new Products("P002", "Product 2", 5, 30.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println("All products in the inventory:");
        inventory.displayProducts();

        inventory.updateProduct("P001", "Updated Product 1", 15, 55.0);

     
        System.out.println("After updating product P001:");
        inventory.displayProducts();

        inventory.deleteProduct("P002");


        System.out.println("After deleting product P002:");
        inventory.displayProducts();
    }
}

