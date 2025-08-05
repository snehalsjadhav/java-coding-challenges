# Java Coding Challenges

A collection of Java implementations for common coding challenges and algorithms. This repository contains simple, well-documented Java classes that demonstrate various fundamental programming concepts.

## Implemented Challenges

This repository includes the following implementations:

1. **Array Reversal** - Reverses the elements of an array
2. **Factorial Calculation** - Calculates the factorial of a number (both iterative and recursive approaches)
3. **Palindrome Checker** - Determines if a string is a palindrome
4. **Bubble Sort** - Sorts an array using the bubble sort algorithm
5. **Fibonacci Series** - Generates the Fibonacci sequence

## Source Files Description

This repository contains the following Java source files:

- **ArrayReverser.java** - Contains methods to reverse an array of integers. Demonstrates basic array manipulation and in-place operations.

- **FactorialCalculator.java** - Provides both iterative and recursive implementations for calculating factorials. Shows different approaches to solving the same problem and demonstrates recursion.

- **PalindromeChecker.java** - Implements a case-insensitive palindrome checker that ignores non-alphanumeric characters. Demonstrates string manipulation and character processing.

- **BubbleSort.java** - Contains an implementation of the bubble sort algorithm for sorting integer arrays. Demonstrates a basic sorting algorithm and array manipulation.

- **FibonacciGenerator.java** - Provides methods to generate Fibonacci sequences and individual Fibonacci numbers. Shows both iterative and recursive approaches to sequence generation.

- **Main.java** - A demonstration class that showcases all the implemented algorithms in one place. Provides a comprehensive example of how to use each class.

## How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compiling the Code

To compile all the Java files, navigate to the root directory of the project and run:

```bash
javac src/*.java
```

### Running Individual Classes

Each class has its own `main` method for demonstration. To run a specific class, use:

```bash
java -cp src ArrayReverser
java -cp src FactorialCalculator
java -cp src PalindromeChecker
java -cp src BubbleSort
java -cp src FibonacciGenerator
```

### Running the Main Demo

To run all demonstrations at once, use:

```bash
java -cp src Main
```

## Example Outputs

### Array Reversal

```
Original array:
1, 2, 3, 4, 5

Reversed array:
5, 4, 3, 2, 1
```

### Factorial Calculation

```
Factorial of 5 (iterative): 120
Factorial of 5 (recursive): 120
```

### Palindrome Check

```
"racecar" is a palindrome
"A man, a plan, a canal: Panama" is a palindrome
"hello" is not a palindrome
```

### Bubble Sort

```
Original array:
64, 34, 25, 12, 22, 11, 90

Sorted array:
11, 12, 22, 25, 34, 64, 90
```

### Fibonacci Series

```
Fibonacci Series (10 terms):
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
```

## Contributing

Contributions are welcome! Feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.