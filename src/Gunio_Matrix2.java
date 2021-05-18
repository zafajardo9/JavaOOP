import java.util.*;

public class Gunio_Matrix2 {
    public static void main(String[] args) {

        int rows = 2, columns = 3;
        int[][] array_A = {{2,3,4},
                            {6,1,5}};
        int[][] array_B = {{7,6,9},
                            {10,6,3}};

        int[][] array_C = new int[rows][columns];
        //method
        addMatrices(array_A, array_B, array_C, rows, columns);


        System.out.println("Printing Array C");
        //for loop table printing
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(array_C[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }


    public static void addMatrices(int[][] array_A, int[][] array_B, int[][] array_C, int rows, int columns) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array_C[i][j] = array_A[i][j] + array_B[i][j];
            }
        }
    }
}
