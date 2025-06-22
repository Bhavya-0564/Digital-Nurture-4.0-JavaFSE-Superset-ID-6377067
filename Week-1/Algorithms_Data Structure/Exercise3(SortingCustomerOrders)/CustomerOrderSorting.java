public class CustomerOrderSorting {

    // Order Class
    static class Order {
        String orderId;
        String customerName;
        double totalPrice;

        public Order(String orderId, String customerName, double totalPrice) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalPrice = totalPrice;
        }

        @Override
        public String toString() {
            return String.format("Order ID: %s, Customer: %s, Total Price: $%.2f",
                    orderId, customerName, totalPrice);
        }
    }

    // Bubble Sort Implementation
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    // Swap orders[j] and orders[j+1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    // Quick Sort Implementation
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        // Choosing the last element as the pivot
        double pivot = orders[high].totalPrice;
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (orders[j].totalPrice <= pivot) {
                i++;

                // swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // swap orders[i+1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    // Helper method to print orders
    public static void printOrders(String title, Order[] orders) {
        System.out.println(title);
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of orders for Bubble Sort
        Order[] ordersBubble = {
            new Order("ORD005", "Alice", 150.75),
            new Order("ORD001", "Bob", 200.00),
            new Order("ORD003", "Charlie", 50.20),
            new Order("ORD002", "David", 300.50),
            new Order("ORD004", "Eve", 75.00)
        };

        System.out.println("Original Orders for Bubble Sort:");
        printOrders("", ordersBubble);

        // Create a copy for Quick Sort
        Order[] ordersQuick = java.util.Arrays.copyOf(ordersBubble, ordersBubble.length);

        // Apply Bubble Sort
        long startTimeBubble = System.nanoTime();
        bubbleSort(ordersBubble);
        long endTimeBubble = System.nanoTime();
        printOrders("Orders after Bubble Sort (by Total Price):", ordersBubble);
        System.out.println("Bubble Sort Time: " + (endTimeBubble - startTimeBubble) + " nanoseconds\n");

        // Apply Quick Sort
        long startTimeQuick = System.nanoTime();
        quickSort(ordersQuick, 0, ordersQuick.length - 1);
        long endTimeQuick = System.nanoTime();
        printOrders("Orders after Quick Sort (by Total Price):", ordersQuick);
        System.out.println("Quick Sort Time: " + (endTimeQuick - startTimeQuick) + " nanoseconds\n");
    }
} 