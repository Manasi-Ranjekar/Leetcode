class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int sum=0;
        for(int rowNo=0;rowNo<rows;rowNo++){
            int primaryDiagonal=mat[rowNo][rowNo];
            int secondaryDiagonal=mat[rowNo][columns-rowNo-1];
            sum+=primaryDiagonal;
            if(rowNo!=(columns-rowNo-1)){
                sum+=secondaryDiagonal;
            }
        }
        return sum;
    }
}