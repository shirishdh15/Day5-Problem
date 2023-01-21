package Day5;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 2D Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                writer.print(arr[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();
    }
}
