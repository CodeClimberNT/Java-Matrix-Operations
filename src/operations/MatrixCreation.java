package operations;

import controls.MatrixUtils;

public class MatrixCreation {

    public static int[][] identityMatrix(int dimension){
        int matrix[][] = new int[dimension][dimension];

        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                if(i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        MatrixUtils.showMatrix(matrix);
        return matrix;
    }
}
