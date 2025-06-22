## Exercise 3: Sorting Customer Orders

### Scenario

This exercise focuses on sorting customer orders by their total price on an e-commerce platform to prioritize high-value orders.

### 1. Understanding Sorting Algorithms

Sorting algorithms are methods used to arrange elements in a list or array in a specific order (ascending or descending). This project implements and compares two common sorting algorithms: Bubble Sort and Quick Sort.

*   **Bubble Sort:**
    *   **Concept:** A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
    *   **Time Complexity:**
        *   **Worst-case and Average-case:** O(n^2), where 'n' is the number of items being sorted. This occurs when the array is in reverse order.
        *   **Best-case:** O(n) if the array is already sorted.
    *   **Space Complexity:** O(1) (in-place sort).

*   **Quick Sort:**
    *   **Concept:** A highly efficient, comparison-based sorting algorithm that uses a divide-and-conquer approach. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
    *   **Time Complexity:**
        *   **Worst-case:** O(n^2), occurs rarely, typically when the pivot selection is poor (e.g., always picking the smallest or largest element in an already sorted array).
        *   **Average-case:** O(n log n).
        *   **Best-case:** O(n log n).
    *   **Space Complexity:** O(log n) due to the recursive call stack.

*   **Insertion Sort (Mentioned, but not implemented in this project):**
    *   **Concept:** Builds the final sorted array (or list) one item at a time. It iterates through the input elements and inserts each element into its correct position in the sorted part of the array.
    *   **Time Complexity:** O(n^2) in average and worst cases, O(n) in best case.

*   **Merge Sort (Mentioned, but not implemented in this project):**
    *   **Concept:** A divide-and-conquer algorithm that divides the unsorted list into n sublists, each containing one element, and then repeatedly merges sublists to produce new sorted sublists until there is only one sorted sublist remaining.
    *   **Time Complexity:** O(n log n) in all cases (worst, average, and best).

### 2. Project Setup

The project consists of a single Java class, `CustomerOrderSorting.java`, which contains the `Order` class definition and the sorting algorithm implementations.

#### `Order` Class

The `Order` class represents a customer order with the following attributes:

*   `orderId` (String): A unique identifier for the order.
*   `customerName` (String): The name of the customer who placed the order.
*   `totalPrice` (double): The total price of the order.

It also includes a `toString()` method for easy printing of order details.

### 3. Implementation Details

The `CustomerOrderSorting` class provides static methods for sorting an array of `Order` objects.

#### Bubble Sort Implementation

The `bubbleSort` method sorts the orders by `totalPrice` in ascending order. It includes an optimization to stop early if the array becomes sorted during a pass.

#### Quick Sort Implementation

The `quickSort` method sorts the orders by `totalPrice` using the Quick Sort algorithm. It uses the last element as the pivot.

### 4. Analysis

#### Performance Comparison (Time Complexity)

*   **Bubble Sort:** Has a time complexity of O(n^2) in the average and worst-case scenarios. This means that as the number of elements (n) to be sorted increases, the execution time grows quadratically. For a large number of orders, Bubble Sort becomes very slow.

*   **Quick Sort:** Has an average-case time complexity of O(n log n). This is significantly more efficient than O(n^2) for larger datasets. While its worst-case is O(n^2), it is rare in practice and can often be mitigated with good pivot selection strategies.

In the `main` method of `CustomerOrderSorting.java`, both sorting algorithms are applied to a sample set of orders, and their execution times are measured and printed to demonstrate this difference.

#### Why Quick Sort is Generally Preferred Over Bubble Sort

Quick Sort is generally preferred over Bubble Sort for several key reasons:

1.  **Efficiency:** Quick Sort's average-case time complexity of O(n log n) makes it much faster than Bubble Sort (O(n^2)) for large datasets. This is crucial for applications dealing with many customer orders.
2.  **Scalability:** As the number of orders grows, the performance gap between Quick Sort and Bubble Sort widens dramatically. Quick Sort scales much better.
<<<<<<< HEAD
3.  **Practical Performance:** Despite a theoretical worst-case of O(n^2), Quick Sort's average-case performance is excellent, and it often outperforms other O(n log n) algorithms like Merge Sort in practice due to better constant factors and cache performance.
=======
3.  **Practical Performance:** Despite a theoretical worst-case of O(n^2), Quick Sort's average-case performance is excellent, and it often outperforms other O(n log n) algorithms like Merge Sort in practice due to better constant factors and cache performance.
>>>>>>> 0a723bc (Initial commit for Week 1)
