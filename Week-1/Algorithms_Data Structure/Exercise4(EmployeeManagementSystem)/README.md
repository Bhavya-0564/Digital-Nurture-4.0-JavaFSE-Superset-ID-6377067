<<<<<<< HEAD
# Employee Management System
=======
# Exercise 4: Employee Management System
>>>>>>> 0a723bc (Initial commit for Week 1)

## Scenario:
You are developing an employee management system for a company. Efficiently managing employee records is crucial.

## Steps:
<<<<<<< HEAD
1.  **Understand Array Representation:**
    *   Explain how arrays are represented in memory and their advantages.
2.  **Setup:**
    *   Create a class `Employee` with attributes like `employeeId`, `name`, `position`, and `salary`.
3.  **Implementation:**
    *   Use an array to store employee records.
    *   Implement methods to add, search, traverse, and delete employees in the array.
4.  **Analysis:**
=======
1.  **Setup:**
    *   Create a class `Employee` with attributes like `employeeId`, `name`, `position`, and `salary`.
2.  **Implementation:**
    *   Use an array to store employee records.
    *   Implement methods to add, search, traverse, and delete employees in the array.
3.  **Analysis:**
>>>>>>> 0a723bc (Initial commit for Week 1)
    *   Analyze the time complexity of each operation (add, search, traverse, delete).
    *   Discuss the limitations of arrays and when to use them.

## Analysis:

### Time Complexity:

*   **Add (at the end):** O(1) - On average, adding an employee to the end of the array takes constant time, as long as the array is not full. If the array needs to be resized (which is not implemented in this basic example), it would be O(N) where N is the number of elements, due to copying elements to a new, larger array.
*   **Search:** O(N) - Searching for an employee by ID requires iterating through the array in the worst case (employee is at the end or not found).
*   **Traverse:** O(N) - Traversing all employees requires iterating through the array once to print each element.
*   **Delete (by ID):** O(N) - Deleting an employee by ID involves searching for the employee (O(N)) and then, if found, shifting all subsequent elements to fill the gap (O(N)). In the worst case, if the first element is deleted, N-1 elements need to be shifted.

### Limitations of Arrays:

*   **Fixed Size:** Arrays have a fixed size once declared. If the number of elements exceeds the allocated size, a new, larger array must be created, and all existing elements copied, which is an expensive operation. This system has a fixed initial capacity, and will not grow dynamically.
*   **Inefficient Insertions/Deletions (in the middle):** Inserting or deleting elements in the middle of an array requires shifting a large number of subsequent elements, leading to O(N) time complexity.
*   **Memory Waste:** If an array is allocated with a large size to accommodate future growth but is not fully utilized, it can lead to wasted memory.

### When to use Arrays:

*   **Fixed Number of Elements:** When the maximum number of elements is known in advance and does not change frequently.
*   **Frequent Access by Index:** When there is a need for fast, direct access to elements based on their index.
*   **Homogeneous Data:** When storing a collection of elements of the same data type.
<<<<<<< HEAD
*   **Memory Efficiency (when full):** When fully utilized, arrays can be very memory-efficient due to contiguous storage. 
=======
*   **Memory Efficiency (when full):** When fully utilized, arrays can be very memory-efficient due to contiguous storage. 
>>>>>>> 0a723bc (Initial commit for Week 1)
