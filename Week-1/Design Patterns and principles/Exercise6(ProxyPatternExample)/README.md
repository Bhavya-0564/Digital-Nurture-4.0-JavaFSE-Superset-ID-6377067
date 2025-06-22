# Proxy Pattern Example

This folder contains a Java implementation of the Proxy Design Pattern.

The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. This pattern is useful when you want to add an extra layer of control or functionality to an object without modifying its core structure.

## Files:

- `Image.java`: Interface for image loading.
- `RealImage.java`: Concrete implementation of the `Image` interface that loads an image from disk.
- `ProxyImage.java`: Proxy implementation of the `Image` interface. It controls access to `RealImage` by loading the image only when `display()` is called for the first time.
- `ProxyPatternTest.java`: Main class to demonstrate the usage of the Proxy Pattern.

## How to Run:

1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the main class:
   ```bash
   java ProxyPatternTest
   ```

<<<<<<< HEAD
This will demonstrate how `RealImage` is only loaded once, and subsequent calls to `display()` on the `ProxyImage` will use the cached `RealImage`. 
=======
This will demonstrate how `RealImage` is only loaded once, and subsequent calls to `display()` on the `ProxyImage` will use the cached `RealImage`. 
>>>>>>> 0a723bc (Initial commit for Week 1)
