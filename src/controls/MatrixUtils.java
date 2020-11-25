package controls;

public final class MatrixUtils {
    
    public static boolean isSquare(int[][] matrix){
        int rows = matrix.length;

        for(int i = 0; i < rows; i++) {
            if( !(matrix[i].length == rows) ) {
                return false;
            }
        }
        return true;
    }

    public static void showMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int dimension(int[][] matrix) {
        if(isSquare(matrix)) {
            return matrix.length;
        } else {
            System.out.println("Can calculate only Square Matrix dimension for now...");
            return -1;
        }
    }
}
