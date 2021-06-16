package Assignments.Day3.Assignment2;

public class Arrays2D {
    public static void main(String[] args) {
        //Initialize 2D arrays
        int firstArrayMatrix[][] = {{1, 1, 1}, {1, 1, 1}};
        int secondArrayMatrix[][] = {{2, 2, 2}, {2, 2, 2}};

        displayArrayMatrix("Matrix 1",firstArrayMatrix);
        System.out.println();
        displayArrayMatrix("Matrix 2",secondArrayMatrix);
        System.out.println();

        displayArrayMatrix("Sum of matrices",matrixAddition(firstArrayMatrix,secondArrayMatrix));
    }

    static void displayArrayMatrix(String header, int[][] array){
        System.out.println(header);
        for (int i = 0; i<array.length; i++){
            for (int j =0; j<array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrixAddition(int[][] array1, int[][] array2){
        int[][] array = new int[array1.length][array1[0].length];

        for(int row =0; row <array1.length ; row++){
            for (int col =0; col<array1[0].length; col++){
                array[row][col] = array1[row][col]+array2[row][col];
            }
        }
        return array;
    }
}
