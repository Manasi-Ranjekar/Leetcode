class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int[] result=new int[rows*columns];
        int index=0;
        for(int d=0;d<rows+columns-1;d++){
            ArrayList<Integer> diagonal=new ArrayList<>();
            int r=(d<columns)?0:d-columns+1;
            int c=(d<columns)?d:columns-1;
            while(r<rows && c>=0){
                diagonal.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                for(int i=diagonal.size()-1;i>=0;i--){
                    result[index++]=diagonal.get(i);
                }
            }
            else{
                for(int num:diagonal){
                    result[index++]=num;
                }
            }
        }
        return result;
    }
}