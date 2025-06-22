package CommandPatternExample;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Create receiver
        Light light = new Light();

        // Create concrete commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Turn light on
        remote.setCommand(lightOn);
        System.out.println("Pressing button to turn light ON:");
        remote.pressButton();

        System.out.println("\n---\n");

        // Turn light off
        remote.setCommand(lightOff);
        System.out.println("Pressing button to turn light OFF:");
        remote.pressButton();

        System.out.println("\n---\n");

        // Try pressing without a command set
        remote.setCommand(null);
        System.out.println("Pressing button with no command set:");
        remote.pressButton();
    }
} 