import java.util.*;
public class Gunio_2dDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers (Can be positive or negative)");
        //user input system
        int n = 4;
        int[][] array = new int[4][4]; // can be changed
        //getting user input
        for(int i = 0;i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                System.out.print("Number " + i + ", " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The table array");
        for(int i = 0;i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
        //method to display diagonal array/matrix
        Diagonal(array, n);
    }

    public static int[][] Diagonal(int[][] array, int n) {
        System.out.print("Diagonal Table: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal diagonal
                if (i == j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println("");

        return array;
    }

}
