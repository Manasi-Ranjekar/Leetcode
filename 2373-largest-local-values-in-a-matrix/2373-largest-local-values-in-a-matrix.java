class Solution {
    public int[][] largestLocal(int[][] grid) {
        //number of rows
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];
        //check every possible 3*3 window
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=grid[i][j];
                //traverse all cells inside currect 3*3matrix
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(grid[r][c]>max){
                            max=grid[r][c];
                        }
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}