public class EcommerceSearch {

    // Product Class
    static class Product {
        String productId;
        String productName;
        String category;

        public Product(String productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product [ID=" + productId + ", Name=" + productName + ", Category=" + category + "]";
        }
    }

    // Linear Search Implementation
    public static Product linearSearch(Product[] products, String query) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(query) || product.productId.equalsIgnoreCase(query)) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Binary Search Implementation (requires sorted array by productId)
    public static Product binarySearch(Product[] products, String productId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = products[mid].productId.compareToIgnoreCase(productId);

            if (cmp == 0) {
                return products[mid]; // Product found
            } else if (cmp < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return null; // Product not found
    }

    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product("P003", "Tablet", "Electronics"),
            new Product("P001", "Laptop", "Electronics"),
            new Product("P005", "Desk Chair", "Furniture"),
            new Product("P002", "Mouse", "Electronics"),
            new Product("P004", "Keyboard", "Electronics")
        };

        System.out.println("--- Linear Search ---");
        String searchQueryLinear = "Laptop";
        Product foundProductLinear = linearSearch(products, searchQueryLinear);
        if (foundProductLinear != null) {
            System.out.println("Found (Linear): " + foundProductLinear);
        } else {
            System.out.println("Product '" + searchQueryLinear + "' not found (Linear).");
        }

        searchQueryLinear = "NonExistent";
        foundProductLinear = linearSearch(products, searchQueryLinear);
        if (foundProductLinear != null) {
            System.out.println("Found (Linear): " + foundProductLinear);
        } else {
            System.out.println("Product '" + searchQueryLinear + "' not found (Linear).");
        }

        System.out.println("--- Binary Search ---");
        // For binary search, the array must be sorted by productId
        java.util.Arrays.sort(products, (p1, p2) -> p1.productId.compareToIgnoreCase(p2.productId));

        System.out.println("Sorted Products for Binary Search:");
        for (Product p : products) {
            System.out.println(p);
        }

        String searchQueryBinary = "P002";
        Product foundProductBinary = binarySearch(products, searchQueryBinary);
        if (foundProductBinary != null) {
            System.out.println("Found (Binary): " + foundProductBinary);
        } else {
            System.out.println("Product ID '" + searchQueryBinary + "' not found (Binary).");
        }

        searchQueryBinary = "P006";
        foundProductBinary = binarySearch(products, searchQueryBinary);
        if (foundProductBinary != null) {
            System.out.println("Found (Binary): " + foundProductBinary);
        } else {
            System.out.println("Product ID '" + searchQueryBinary + "' not found (Binary).");
        }
    }
} 