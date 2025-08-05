/**
 * A class that provides functionality to reverse an array.
 */
public class ArrayReverser {
    
    /**
     * Reverses the elements of an integer array.
     * 
     * @param array The array to be reversed
     * @return A new array with elements in reverse order
     */
    public static int[] reverse(int[] array) {
        if (array == null) {
            return null;
        }
        
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
    
    /**
     * Demonstrates the array reversal functionality.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        printArray(numbers);
        
        int[] reversed = reverse(numbers);
        System.out.println("\nReversed array:");
        printArray(reversed);
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