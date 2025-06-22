public class InventoryManagementSystem {

    // Product Class
    static class Product {
        private String productId;
        private String productName;
        private int quantity;
        private double price;

        public Product(String productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        // Getters
        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        // Setters
        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: $" + price;
        }
    }

    // Inventory Class
    static class Inventory {
        private java.util.HashMap<String, Product> products;

        public Inventory() {
            this.products = new java.util.HashMap<>();
        }

        public void addProduct(Product product) {
            if (products.containsKey(product.getProductId())) {
                System.out.println("Error: Product with ID " + product.getProductId() + " already exists.");
            } else {
                products.put(product.getProductId(), product);
                System.out.println("Product " + product.getProductName() + " added successfully.");
            }
        }

        public void updateProduct(String productId, Integer newQuantity, Double newPrice) {
            if (!products.containsKey(productId)) {
                System.out.println("Error: Product with ID " + productId + " not found.");
            } else {
                Product product = products.get(productId);
                if (newQuantity != null) {
                    product.setQuantity(newQuantity);
                }
                if (newPrice != null) {
                    product.setPrice(newPrice);
                }
                System.out.println("Product " + product.getProductName() + " (ID: " + productId + ") updated successfully.");
            }
        }

        public void deleteProduct(String productId) {
            if (!products.containsKey(productId)) {
                System.out.println("Error: Product with ID " + productId + " not found.");
            } else {
                products.remove(productId);
                System.out.println("Product with ID " + productId + " deleted successfully.");
            }
        }

        public Product getProduct(String productId) {
            return products.get(productId);
        }

        public void listProducts() {
            if (products.isEmpty()) {
                System.out.println("Inventory is empty.");
            } else {
                System.out.println("\n--- Current Inventory ---");
                for (Product product : products.values()) {
                    System.out.println(product);
                }
                System.out.println("-------------------------\n");
            }
        }
    }

    // Main method for example usage
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        inventory.addProduct(new Product("P001", "Laptop", 10, 1200.00));
        inventory.addProduct(new Product("P002", "Mouse", 50, 25.00));
        inventory.addProduct(new Product("P003", "Keyboard", 30, 75.00));
        inventory.addProduct(new Product("P001", "Monitor", 5, 300.00)); // This will show an error

        inventory.listProducts();

        // Update product
        inventory.updateProduct("P002", 45, null);
        inventory.updateProduct("P004", null, 150.00); // This will show an error

        inventory.listProducts();

        // Delete product
        inventory.deleteProduct("P003");
        inventory.deleteProduct("P005"); // This will show an error

        inventory.listProducts();

        // Get a specific product
        Product product = inventory.getProduct("P001");
        if (product != null) {
            System.out.println("Found product: " + product);
        } else {
            System.out.println("Product P001 not found.");
        }
    }
} 