import java.util.*;
public class Gunio_2dNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers (Can be positive or negative)");

        int[][] array = new int[5][5]; //25 elements... can be changed
        int[][] array_negative = new int[2][2];
        for(int i = 0;i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        //searching negative values
        Negative(array, array_negative);
        //printing the array
        Printing(array_negative);
    }

    public static int[][] Negative(int[][] array, int[][] array_negative) {
        for(int i = 0;i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                if(array[i][j] <= 0) {
                    array_negative[i][j] = array[i][j];
                }
            }
        }
        return array_negative;
    }

    public static void Printing(int[][] array_negative) {
        for(int i = 0;i < array_negative.length; i++) {
            for(int j=0; j < array_negative.length; j++) {
                System.out.println("Number:" + array_negative[i][j]);
            }
        }
    }
}

