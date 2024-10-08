// Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

// A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
public class Toeplitz {
    public boolean isToeplitzMatrix(int[][] matrix) {
       
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                
                if(matrix[i][j] != matrix[i+1][j+1]){
                     return false;
                }
            }
        }
        return true;
    }
}
