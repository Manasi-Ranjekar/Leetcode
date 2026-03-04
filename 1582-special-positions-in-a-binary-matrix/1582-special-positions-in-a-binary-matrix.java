class Solution {
    private boolean checker(int[][] mat, int r, int c){
        for(int i=0;i<mat.length;i++){
            if(mat[i][c]==1 && i!=r){
                return false;
            }
        }
        for(int j=0;j<mat[0].length;j++){
            if(mat[r][j]==1 && j!=c){
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && checker(mat,i,j)){
                    ans++;
                }
            }
        }
        return ans;
    }
}