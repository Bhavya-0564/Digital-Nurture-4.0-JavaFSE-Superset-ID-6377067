package BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                                            .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Create a gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                            .withGraphicsCard("NVIDIA RTX 4080")
                                            .withStorage("1TB NVMe SSD")
                                            .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create a work computer
        Computer workComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                                          .withStorage("512GB SSD")
                                          .withOperatingSystem("Windows 11 Pro")
                                          .build();
        System.out.println("Work Computer: " + workComputer);
    }
} 