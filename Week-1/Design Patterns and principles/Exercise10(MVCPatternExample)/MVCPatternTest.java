package MVCPatternExample;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a Student (Model)
        Student model = new Student("John Doe", "S101", "A");

        // Create a StudentView (View)
        StudentView view = new StudentView();

        // Create a StudentController (Controller)
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update student details through the controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();

        // Update only the ID
        controller.setStudentId("S102");
        System.out.println("\nStudent Details after ID update:");
        controller.updateView();
    }
} 