
import java.util.*;
class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int sc=0,sr=0;
        int ec = matrix[0].length-1,er = matrix.length-1;
        
        while(sr <= er && sc <= ec){
            
            for(int i=sc;i<=ec;i++){
                list.add(matrix[sr][i]);
                }
            for(int j =sr+1;j<=er;j++){
                list.add(matrix[j][ec]);
            }
            for(int i=ec-1;i>=sc;i--){
                if(sr == er){
                    break;
                }
                list.add(matrix[er][i]);
            }
            for(int j=er-1;j>=sr+1;j--){
                if(sc == ec){
                    break;
                }
                list.add(matrix[j][sc]);
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        return list;
    }
}