import java.util.*;

public class Gunio_Matrix {

    public static void main(String[] args) {

        int rows = 2, columns = 3;
        int[][] array_A = {{2,3,4},
                            {6,1,5}};
        int[][] array_B = {{7,6,9},
                            {10,6,3}};
        int[][] array_C = new int[rows][columns];

        Matrices matrices = new Matrices(array_A, array_B, array_C, rows, columns);

        //FOR PRINTING ARRAY A AND B
        System.out.println("Printing Array A");
        System.out.println(Arrays.deepToString(array_A));
        System.out.println("Printing Array B");
        System.out.println(Arrays.deepToString(array_B));


        System.out.println("Printing Array C");
        matrices.addMatrices();
        matrices.printSumMatrix();
    }
}

abstract class Matrix {

    private int[][] array_A;
    private int[][] array_B;
    private int[][] array_C;
    private int rows;
    private int columns;

    public Matrix(int[][] array_A, int[][]array_B, int[][] array_C, int rows, int columns) {
        this.array_A = array_A;
        this.array_B = array_B;
        this.array_C = array_C;
        this.rows = rows;
        this.columns = columns;
    }
    //get and set
    public int[][] getArray_A() {
        return array_A;
    }
    public void setArray_A(int[][] array_A) {
        this.array_A = array_A;
    }

    //get and set
    public int[][] getArray_B() {
        return array_B;
    }
    public void setArray_B(int[][] array_B) {
        this.array_B = array_B;
    }

    //get and set
    public int[][] getArray_C() {
        return array_C;
    }
    public void setArray_C(int[][] array_C) {
        this.array_C = array_C;
    }

    //get and set
    public int rows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }

    //get and set
    public int columns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }

}

class Matrices extends Matrix{ //will be the main function
    public Matrices(int[][] array_A, int[][] array_B, int[][] array_C, int rows, int columns) {
        super(array_A, array_B, array_C, rows, columns);
    }

    void addMatrices() {
        for(int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                getArray_C()[i][j] = getArray_A()[i][j] + getArray_B()[i][j];
            }
        }
    }

    void printSumMatrix() {
        for(int i = 0; i < rows(); i++) {
            for(int j = 0; j < columns(); j++) {
                System.out.print(getArray_C()[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
