/**
 * A class that provides functionality to sort an array using the Bubble Sort algorithm.
 */
public class BubbleSort {
    
    /**
     * Sorts an array of integers in ascending order using the Bubble Sort algorithm.
     * 
     * @param array The array to be sorted
     * @return A new sorted array
     */
    public static int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        // Create a copy of the array to avoid modifying the original
        int[] result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        
        // Bubble sort implementation
        for (int i = 0; i < result.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    // Swap elements
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swapping occurred in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        
        return result;
    }
    
    /**
     * Demonstrates the bubble sort functionality.
     */
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        printArray(numbers);
        
        int[] sorted = sort(numbers);
        System.out.println("\nSorted array:");
        printArray(sorted);
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