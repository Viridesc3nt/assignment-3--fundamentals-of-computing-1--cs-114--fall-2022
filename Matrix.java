import java.util.Scanner;

public class Matrix{

    private int matrix;
    private int[][] table = new int[matrix][matrix];


    private Matrix(){

        System.out.print("Please enter the size of your matrix: ");

        Scanner scanner = new Scanner(System.in);
        int matrix = scanner.nextInt();

        System.out.println();
        System.out.println("Your matrix is " + matrix + " x " + matrix);
    }

    private void swap(){

    }

    public void printMatrix(){

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (0 * matrix);
            }
        }

        // Print the default table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print (table[row][col] + "\t");
            }

                System.out.println();
        }
    }

    public void populateMatrix(){

        System.out.println();
        System.out.println("Printing matrix:");

        // Load the table with values
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = ((row * matrix) + col + 1);
            }
        }

        // Print the table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print (table[row][col] + "\t");
            }

                System.out.println();
        }
    }

    public void flipMatrix(){

    }
}
