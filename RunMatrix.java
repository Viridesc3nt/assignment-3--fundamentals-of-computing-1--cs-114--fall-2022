import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {

        System.out.print("Please enter the size of your matrix: ");

        Scanner scanner = new Scanner(System.in);
        int matrix = scanner.nextInt();

        int[][] table = new int[matrix][matrix];

        System.out.println();
        System.out.println("Your matrix is " + matrix + " x " + matrix);

        // Load the table with zeros
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

        System.out.println();
        System.out.println("Printing flipped matrix:");

        // Swapping values of the table
        for (int row = 0; row < matrix / 2; row++) {
            for (int col = 0; col < matrix; col++) {
                int swappedNumber = table[row][col];
                table[row][col] = table[matrix - 1 - row][matrix - 1 - col];
                table[matrix - 1 - row][matrix - 1 - col] = swappedNumber;
            }
        }

        // Print flipped table
        for (int row = 0; row < matrix; row++) {
            for (int col = 0; col < matrix; col++) {
                System.out.print (table[row][col]+ "\t");
            }
            System.out.println();
        }
    }
}
