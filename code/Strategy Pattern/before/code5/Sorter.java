// Sorter class without strategy pattern
public class Sorter {

    public void sort(int[] array, String algorithm) {
        if ("bubble".equals(algorithm)) {
            // Logic for bubble sort
            System.out.println("Sorting using Bubble Sort");
            // Actual sorting code
        } else if ("quick".equals(algorithm)) {
            // Logic for quick sort
            System.out.println("Sorting using Quick Sort");
            // Actual sorting code
        } else {
            // Default case (no sorting)
            System.out.println("No sorting applied");
        }
    }
}
