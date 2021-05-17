import java.util.Scanner;

public class Gunio_SumRow {

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
        int row = scanner.nextInt();//what row??

        SumRow(array, row);

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

    public static void SumRow(int[][] array, int row) {
        //I'll display the array in a table form

        int sumrow = 0;

        for(int i = 0; i < array.length; i++) {
                sumrow += array[row-1][i]; //array indexes starts at 0 so -1
        }

        System.out.print("Sum of row " + row + " is: " + sumrow);
    }
}
