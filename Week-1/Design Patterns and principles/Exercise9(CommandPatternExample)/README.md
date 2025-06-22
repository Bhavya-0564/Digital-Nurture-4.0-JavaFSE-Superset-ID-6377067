# Command Pattern Example

This folder contains a Java implementation of the Command Design Pattern.

The **Command Pattern** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request's execution, and support undoable operations.

## Files:

*   `Command.java`: An interface for commands.
*   `Light.java`: The receiver class that performs the actual actions (turning light on/off).
*   `LightOnCommand.java`: A concrete command to turn the light on.
*   `LightOffCommand.java`: A concrete command to turn the light off.
*   `RemoteControl.java`: The invoker class that holds a command object and can execute it.
*   `CommandPatternTest.java`: The client class that demonstrates the usage of the Command Pattern.
*   `OUTPUT.jpg`: An image showing the output of the `CommandPatternTest.java` program.

## How to Run:

1.  **Compile the Java files:**
    ```bash
    javac *.java
    ```
2.  **Run the main application:**
    ```bash
    java CommandPatternTest
    ```

## Output:

<<<<<<< HEAD
The program will demonstrate the Command Pattern by turning a light on and off. The expected output is also captured in the `OUTPUT.jpg` file. 
=======
The program will demonstrate the Command Pattern by turning a light on and off. The expected output is also captured in the `OUTPUT.jpg` file. 
>>>>>>> 0a723bc (Initial commit for Week 1)
