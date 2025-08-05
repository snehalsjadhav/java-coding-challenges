/**
 * Main class that demonstrates all the implemented algorithms.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("===== JAVA CODING CHALLENGES DEMO =====\n");
        
        // Array Reversal Demo
        System.out.println("1. ARRAY REVERSAL\n");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(numbers);
        
        int[] reversed = ArrayReverser.reverse(numbers);
        System.out.println("Reversed array:");
        printArray(reversed);
        System.out.println();
        
        // Factorial Calculation Demo
        System.out.println("2. FACTORIAL CALCULATION\n");
        int n = 5;
        System.out.printf("Factorial of %d (iterative): %d%n", n, FactorialCalculator.factorial(n));
        System.out.printf("Factorial of %d (recursive): %d%n%n", n, FactorialCalculator.factorialRecursive(n));
        
        // Palindrome Check Demo
        System.out.println("3. PALINDROME CHECK\n");
        String[] testStrings = {
            "racecar",
            "A man, a plan, a canal: Panama",
            "hello"
        };
        
        for (String str : testStrings) {
            boolean result = PalindromeChecker.isPalindrome(str);
            System.out.printf("\"%s\" is %sa palindrome%n", 
                              str, 
                              result ? "" : "not ");
        }
        System.out.println();
        
        // Bubble Sort Demo
        System.out.println("4. BUBBLE SORT\n");
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(unsortedArray);
        
        int[] sortedArray = BubbleSort.sort(unsortedArray);
        System.out.println("Sorted array:");
        printArray(sortedArray);
        System.out.println();
        
        // Fibonacci Series Demo
        System.out.println("5. FIBONACCI SERIES\n");
        int terms = 10;
        System.out.println("Fibonacci Series (" + terms + " terms):");
        long[] fibSeries = FibonacciGenerator.generateSeries(terms);
        for (int i = 0; i < fibSeries.length; i++) {
            System.out.print(fibSeries[i]);
            if (i < fibSeries.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        
        System.out.println("===== END OF DEMO =====");
    }
    
    /**
     * Helper method to print an array.
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}