package operations;

import controls.MatrixUtils;

//! WORKING IN PROGRESS!

public class Determinant {

    public static double laPlace(int[][] matrix) {
        double determinant = Double.NEGATIVE_INFINITY;
        int subMatrix[][];

        if(!MatrixUtils.isSquare(matrix)) {
            System.out.println("Can calculate determinant only of square matrix");
            return Double.POSITIVE_INFINITY;
        }

        return determinant;
    }

    public static double sarrus(int[][] matrix) {
        double determinant = Double.NEGATIVE_INFINITY;

        if(!MatrixUtils.isSquare(matrix)) {
            System.out.println("Can calculate determinant only of square matrix");
            return Double.POSITIVE_INFINITY;
        }
        

        return determinant;
    }
}
