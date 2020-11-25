package controls;

public final class MatrixUtils {
    
    public static boolean isSquare(double[][] matrix){
        int rows = matrix.length;

        for(int i = 0; i < rows; i++) {
            if( !(matrix[i].length == rows) ) {
                return false;
            }
        }
        return true;
    }

    public static void showMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int dimension(double[][] matrix) {
        if(isSquare(matrix)) {
            return matrix.length;
        } else {
            System.out.println("Can calculate only Square Matrix dimension for now...");
            return -1;
        }
    }

    public static double sumPositiveDiagonal(double[][] matrix) {
        double d1, d2, d3;

        d1 = matrix[0][0] * matrix[1][1] * matrix[2][2];
        d2 = matrix[0][1] * matrix[1][2] * matrix[2][0];
        d3 = matrix[0][2] * matrix[1][0] * matrix[2][1];

        return d1 + d2 + d3;
    }

    public static double sumNegativeDiagonal(double[][] matrix) {
        double d1, d2, d3;

        d1 = matrix[0][2] * matrix[1][1] * matrix[2][0];
        d2 = matrix[0][0] * matrix[1][2] * matrix[2][1];
        d3 = matrix[0][1] * matrix[1][0] * matrix[2][2];

        return d1 + d2 + d3;
    }

}
