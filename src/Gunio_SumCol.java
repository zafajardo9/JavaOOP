import java.util.Scanner;

public class Gunio_SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers (Can be positive or negative) to be store in array");

        int[][] array = new int[3][3]; //9 elements... can be changed

        for(int i = 0;i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        PrintingArray(array);

        System.out.println("What row to show the sum?");
        int col = scanner.nextInt();//what row??

        SumCol(array, col);

    }
    public static void PrintingArray(int[][] array) {
        //I'll display the array in a table form
        System.out.println("The table array");
        for(int i = 0;i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }

    public static void SumCol(int[][] array, int col) {
        //I'll display the array in a table form

        int sumcol = 0;

        for(int i = 0; i < array.length; i++) {
            sumcol += array[i][col-1]; //array indexes starts at 0 so -1
        }

        System.out.print("Sum of Column " + col + " is: " + sumcol);
    }
}
