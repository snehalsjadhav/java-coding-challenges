/**
 * A class that provides functionality to generate Fibonacci series.
 */
public class FibonacciGenerator {
    
    /**
     * Generates a Fibonacci series up to the specified number of terms.
     * 
     * @param n The number of terms in the Fibonacci series to generate
     * @return An array containing the Fibonacci series
     * @throws IllegalArgumentException if n is negative
     */
    public static long[] generateSeries(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of terms cannot be negative");
        }
        
        if (n == 0) {
            return new long[0];
        }
        
        long[] series = new long[n];
        
        if (n >= 1) {
            series[0] = 0;
        }
        
        if (n >= 2) {
            series[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        
        return series;
    }
    
    /**
     * Returns the nth Fibonacci number (recursive implementation).
     * Note: This is inefficient for large values of n due to repeated calculations.
     * 
     * @param n The position in the Fibonacci sequence (0-based)
     * @return The nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public static long getFibonacciNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }
        
        if (n <= 1) {
            return n;
        }
        
        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
    
    /**
     * Demonstrates the Fibonacci series generation functionality.
     */
    public static void main(String[] args) {
        int terms = 10;
        
        System.out.println("Fibonacci Series (" + terms + " terms):");
        long[] series = generateSeries(terms);
        for (int i = 0; i < series.length; i++) {
            System.out.print(series[i]);
            if (i < series.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\n\nIndividual Fibonacci Numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("F(%d) = %d%n", i, getFibonacciNumber(i));
        }
    }
}