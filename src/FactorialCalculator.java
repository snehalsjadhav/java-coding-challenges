/**
 * A class that provides functionality to calculate the factorial of a number.
 */
public class FactorialCalculator {
    
    /**
     * Calculates the factorial of a non-negative integer.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    /**
     * Recursive implementation of factorial calculation.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorialRecursive(n - 1);
    }
    
    /**
     * Demonstrates the factorial calculation functionality.
     */
    public static void main(String[] args) {
        int[] numbers = {0, 1, 5, 10};
        
        System.out.println("Factorial Calculation (Iterative):");
        for (int n : numbers) {
            System.out.printf("factorial(%d) = %d%n", n, factorial(n));
        }
        
        System.out.println("\nFactorial Calculation (Recursive):");
        for (int n : numbers) {
            System.out.printf("factorialRecursive(%d) = %d%n", n, factorialRecursive(n));
        }
    }
}