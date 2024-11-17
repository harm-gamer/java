package Amazon.Medium;

public class UniQuePath {
    public int helper(int[][] memo,int i,int j,int m,int n){
        if(i>=m || j>=n) return 0;
        if(i== m-1 || j== n-1) return 1;
        if(memo[i][j] != -1){
            return memo[i][j];
        }else{
            return memo[i][j] = helper(memo,i+1,j,m,n) + helper(memo,i,j+1,m,n);
        }
    }
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
            for(int i=0;i<memo.length;i++){
                for(int j=0;j<memo[0].length;j++){
                    memo[i][j] = -1;
                }
            }
        
        return helper(memo,0,0,m,n);
    }
}
