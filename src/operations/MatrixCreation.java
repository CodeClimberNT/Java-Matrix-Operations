package operations;

// import controls.MatrixUtils;

public class MatrixCreation {

    public static double[][] identityMatrix(int dimension) {
        double matrix[][] = new double[dimension][dimension];

        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                if(i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static double[][] randomMatrix(int dimension, int value) {
        double matrix[][] = new double[dimension][dimension];
        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                matrix[i][j] = (int) Math.floor(Math.random()*value);
            }
        }
        return matrix;
    }
}
