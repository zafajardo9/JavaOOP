import java.util.*;

public class Gunio_Matrix2 {
    public static void main(String[] args) {


        int[] array_A = {2,3,4};
        int[] array_B = {7,6,9};
        int[][] array_C = new int[3][2];
        addMatrices(array_A, array_B, array_C);

        System.out.println("Printing Array C");
        //Printing
        System.out.println(Arrays.deepToString(array_C));
        //for loop table printing
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(array_C[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }


    public static void addMatrices(int[] array_A, int[] array_B, int[][] array_C) {

        int i, j, k;
        j = k = 0;

        int newLength = array_A.length + array_B.length;


        for(i = 0; i < array_C.length; i++) {
            array_C[i][0] = array_A[i];
            array_C[i][1] = array_B[i];
        }

    }
}
