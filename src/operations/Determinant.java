package operations;

import controls.MatrixUtils;

//! WORK IN PROGRESS!

public class Determinant {

    public static double laPlace(double[][] matrix) {
        double determinant = Double.NEGATIVE_INFINITY;
        double subMatrix[][];

        if(!MatrixUtils.isSquare(matrix)) {
            System.out.println("Can calculate determinant only of square matrix");
            return Double.POSITIVE_INFINITY;
        }

        return determinant;
    }

    public static double sarrus(double[][] matrix) {
        double determinant = Double.NEGATIVE_INFINITY;

        if(!MatrixUtils.isSquare(matrix)) {
            System.out.println("Can calculate determinant only of square matrix");
            return determinant;
        }

        switch(MatrixUtils.dimension(matrix)) {
            case 1:
                determinant = matrix[0][0];
                break;
            case 2:
                determinant = (matrix[0][0]*matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
                break;
            case 3:
                determinant = MatrixUtils.sumPositiveDiagonal(matrix) - MatrixUtils.sumNegativeDiagonal(matrix);
                break;
            default:
                System.out.println("Can't use Sarrus with those dimension!");
                break;
        }
        return determinant;
    }

}
