package Amazon.Medium;

public class NumberOfIsland {
    public void DFS(char[][] grid,int i,int j,int row, int col){
        if(i< 0 || j<0 || i>= row  || j >= col ){
            return;
        }
        if(grid[i][j] != '1'){
            return;
        }
        
        if(grid[i][j] == '1'){
            grid[i][j] =0;
            
            DFS(grid , i-1,j,row,col);
             DFS(grid,i+1,j,row,col);
            DFS(grid ,i,j-1,row,col);
            DFS(grid,i,j+1,row,col);
           
        }
    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        int count =0;
        for(int  i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j] == '1'){
                    count++;
                    DFS(grid,i,j,r,c);
                }
            }
        }
        
        return count;
    }
}
