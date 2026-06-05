class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        //check if possible or not
        if(m*n!=r*c){
            return mat;
        }
        int[][] res=new int[r][c];
        for(int i=0;i<m*n;i++){
            //position in new matrix
            res[i/c][i%c]=mat[i/n][i%n];
        }
        return res;
    }
}