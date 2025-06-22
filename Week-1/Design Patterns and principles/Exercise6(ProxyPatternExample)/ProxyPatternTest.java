package ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Image will be loaded only when display() is called for the first time
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First call to display() for image1:");
        image1.display(); // Image will be loaded

        System.out.println("\nSecond call to display() for image1 (should not load again):");
        image1.display(); // Image should be displayed from cache

        System.out.println("\nFirst call to display() for image2:");
        image2.display(); // Image will be loaded
    }
} 