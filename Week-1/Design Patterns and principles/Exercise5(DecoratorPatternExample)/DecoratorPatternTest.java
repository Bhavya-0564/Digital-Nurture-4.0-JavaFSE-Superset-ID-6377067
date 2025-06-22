package DecoratorPatternExample;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic Email notification
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Basic Email Notification:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\n---\n");

        // Email + SMS notification
        Notifier emailAndSmsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("Email and SMS Notification:");
        emailAndSmsNotifier.send("Hello via Email and SMS!");

        System.out.println("\n---\n");

        // Email + SMS + Slack notification
        Notifier allChannelNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("Email, SMS, and Slack Notification:");
        allChannelNotifier.send("Hello via Email, SMS, and Slack!");
    }
} 