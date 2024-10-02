import java.util.*;
// Diagonal sum
class DiagonallyPrint {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(n==0 || m==0){
            return new int[]{0};
        }
         int[]  arr = new int[m*n];
        int i=0;
        int j =0;
        int idx = 0;
        boolean up = true;
        while(i<m && j<n){
            
            if(up){
                while(i>0 && j<n-1){
                    arr[idx++] = mat[i][j];
                    i--;j++;
                }
                arr[idx++] = mat[i][j];
                if(j==n-1){
                    i++;
                }else{
                    j++;
                }
                up = false;
            }
            else{
                while(j>0 && i<m-1){
                    arr[idx++] = mat[i][j];
                    j--;
                    i++;
                }
                arr[idx++] = mat[i][j];
                if(i==m-1){
                    j++;
                }else{
                    i++;
                }
                up = true;
            }
        }
        return arr;
    }
}
