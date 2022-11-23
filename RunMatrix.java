import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {

        System.out.print("Please enter the size of your matrix: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println();
        System.out.println("Your matrix is " + input + " x " + input);
        System.out.println();
        System.out.println("Printing matrix with default values:");

        int[][] table = new int[input][input];

        // Load the table with zeros
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (0 * input);
            }
        }

        // Print the zeros table
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
                table[row][col] = ((row * input) + col + 1);
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
}
