import java.util.Arrays;
public class Quicksort {
    // Main function
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Quick Sort Algorithm");
        System.out.println("---------------------");
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);  // Recursively sort left part
            quickSort(arr, partitionIndex + 1, high); // Recursively sort right part
        }
    }
    // Partition function to find the pivot position
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // Swap if element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Swap pivot to correct position
        return i + 1;
    }
    // Swap function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
