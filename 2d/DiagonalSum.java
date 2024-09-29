class diagonalSum {
    public int diagonalsum(int[][] mat) {
        int n = mat.length-1;
       
        int sum =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || i+j==n){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
    
}