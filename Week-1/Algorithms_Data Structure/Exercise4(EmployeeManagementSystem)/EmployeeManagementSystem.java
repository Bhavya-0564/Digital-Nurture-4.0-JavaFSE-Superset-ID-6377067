public class EmployeeManagementSystem {

    // Employee Class
    static class Employee {
        private String employeeId;
        private String name;
        private String position;
        private double salary;

        public Employee(String employeeId, String name, String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        // Getters
        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public double getSalary() {
            return salary;
        }

        // Setters
        public void setPosition(String position) {
            this.position = position;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("Employee ID: %s, Name: %s, Position: %s, Salary: $%.2f",
                    employeeId, name, position, salary);
        }
    }

    private Employee[] employees;
    private int count;
    private static final int INITIAL_CAPACITY = 10;

    public EmployeeManagementSystem() {
        employees = new Employee[INITIAL_CAPACITY];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee added: " + employee.getName());
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Search Employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Traverse Employees
    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("---------------------");
    }

    // Delete Employee by employeeId
    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null; // Clear the last element
                count--;
                System.out.println("Employee with ID " + employeeId + " deleted successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        System.out.println("\n--- Adding Employees ---");
        ems.addEmployee(new Employee("E001", "Alice Smith", "Software Engineer", 75000.0));
        System.out.println();
        ems.addEmployee(new Employee("E002", "Bob Johnson", "Project Manager", 90000.0));
        System.out.println();
        ems.addEmployee(new Employee("E003", "Charlie Brown", "HR Specialist", 60000.0));
        System.out.println();

        // Traverse employees
        ems.traverseEmployees();

        // Search employee
        System.out.println("\n--- Searching for E002 ---");
        Employee foundEmployee = ems.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println();

        System.out.println("--- Searching for E004 ---");
        foundEmployee = ems.searchEmployee("E004");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println();

        // Delete employee
        System.out.println("--- Deleting E002 ---");
        ems.deleteEmployee("E002");
        System.out.println();
        ems.traverseEmployees();

        System.out.println("\n--- Deleting E005 (non-existent) ---");
        ems.deleteEmployee("E005");
        System.out.println();
        ems.traverseEmployees();

        System.out.println("\n--- Adding more employees to test full array ---");
        ems.addEmployee(new Employee("E004", "David Lee", "Marketing Analyst", 65000.0));
        System.out.println();
        ems.addEmployee(new Employee("E005", "Eve Davis", "Sales Representative", 55000.0));
        System.out.println();
        ems.addEmployee(new Employee("E006", "Frank White", "Accountant", 70000.0));
        System.out.println();
        ems.addEmployee(new Employee("E007", "Grace Hall", "Operations Manager", 95000.0));
        System.out.println();
        ems.addEmployee(new Employee("E008", "Henry Green", "IT Support", 50000.0));
        System.out.println();
        ems.addEmployee(new Employee("E009", "Ivy King", "Customer Service", 45000.0));
        System.out.println();
        ems.addEmployee(new Employee("E010", "Jack Black", "Data Scientist", 110000.0));
        System.out.println();
        ems.addEmployee(new Employee("E011", "Karen Blue", "HR Manager", 80000.0)); // This should fail
        System.out.println();

        ems.traverseEmployees();
    }
} 