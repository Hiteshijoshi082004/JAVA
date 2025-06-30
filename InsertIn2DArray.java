import java.util.Scanner;

public class InsertIn2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = scan.nextInt();
            }
        }

        // Input value and position to insert
        System.out.print("Enter value to insert: ");
        int value = scan.nextInt();

        System.out.print("Enter row index where to insert (0 to " + (rows - 1) + "): ");
        int row = scan.nextInt();

        System.out.print("Enter column index where to insert (0 to " + (cols - 1) + "): ");
        int col = scan.nextInt();

        // Insert value
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            arr[row][col] = value;
        } else {
            System.out.println("Invalid row/column index!");
        }

        // Output updated array
        System.out.println("\nUpdated 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}
