//import java.util.*;
//
//public class Gunio_Matrix {
//
//    public static void main(String[] args) {
//
//        int[][] array_A = {{2,3,4},
//                            {6,1,5}};
//        int[][] array_B = {{7,6,9},
//                            {10,6,3}};
//        int[][] array_C = new int[6][6];
//
//        Matrices matrices = new Matrices(array_A, array_B, array_C);
//
//        System.out.println("Printing Array A");
//
//        System.out.println(Arrays.deepToString(array_A));
//
//        System.out.println("Printing Array B");
//
//        System.out.println(Arrays.deepToString(array_B));
//
//        System.out.println("Printing Array C");
//
//
//
//        System.out.println(matrices.addMatrices());
//
//    }
//}
//
//abstract class Matrix {
//
//    private int[][] array_A;
//    private int[][] array_B;
//    private int[][] array_C;
//
//    public Matrix(int[][] array_A, int[][]array_B, int[][] array_C) {
//        this.array_A = array_A;
//        this.array_B = array_B;
//        this.array_C = array_C;
//    }
//    //get and set
//    public int[][] getArray_A() {
//        return array_A;
//    }
//    public void setArray_A(int[][] array_A) {
//        this.array_A = array_A;
//    }
//
//    //get and set
//    public int[][] getArray_B() {
//        return array_B;
//    }
//    public void setArray_B(int[][] array_B) {
//        this.array_B = array_B;
//    }
//
//    //get and set
//    public int[][] getArray_C() {
//        return array_C;
//    }
//    public void setArray_C(int[][] array_C) {
//        this.array_C = array_C;
//    }
//
//
//}
//
//class Matrices extends Matrix{ //will be the main function
//    public Matrices(int[][] array_A, int[][] array_B, int[][] array_C) {
//        super(array_A, array_B, array_C);
//    }
//    int newLength = getArray_A().length + getArray_B().length;
//
//    int addMatrices() {
//        for(int i = 0; i < newLength; i++) {
//            for(int j = 0; j < newLength; j++) {
//                getArray_C()[i][j] = getArray_A()[i][0];
//            }
//            getArray_C()[i][1] = getArray_B()[i][0];
//        }
//        return ;
//    }
//}
