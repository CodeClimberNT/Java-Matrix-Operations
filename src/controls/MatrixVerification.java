package controls;

public final class MatrixVerification {
    
    public static boolean isSquare(int[][] matrix){
        int rows = matrix.length;

        for(int i = 0; i < rows; i++) {
            if( !(matrix[i].length == rows) ) {
                return false;
            }
        }
        return true;
    }

    public static int squareDimension(int[][] matrix) {
        if(isSquare(matrix)) {
            return matrix.length;
        } else {
            System.out.println("Can calculate only Square Matrix dimension for now...");
            return -1;
        }
    }
}
