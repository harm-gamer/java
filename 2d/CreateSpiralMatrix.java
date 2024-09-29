// 
class CreateSpiralMatrix {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        
        int sr =0,sc=0;
        int ec = n-1,er = n-1;
        int num = 1;
        
        while(sr <=er && sc <= ec){
            //top
            for(int i=sc;i<=ec;i++){
                matrix[sr][i] = num++;
            }
            //right
            for(int i=sr+1;i<=ec;i++){
               
                matrix[i][ec] = num++;
            }
            for(int i=ec-1;i>=sc;i--){
               if(sr == er){
                    break;
                }
                matrix[er][i] = num++;
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc ==ec){
                    break;
                }
                matrix[i][sc] = num++;
            }
            
            sr++;
            sc++;
            er--;
            ec--;
        }
        return matrix;
    }
}
