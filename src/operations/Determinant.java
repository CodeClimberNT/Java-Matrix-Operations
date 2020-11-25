package operations;

import controls.MatrixUtils;

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
        } else if(MatrixUtils.dimension(matrix) > 3 ){
            System.out.println("Can calculate determinant only of matrix with 3 or less dimensions");
            System.out.println("Using LaPlace method...");
            return Determinant.laPlace(matrix);
        }


        return determinant;
    }
}
