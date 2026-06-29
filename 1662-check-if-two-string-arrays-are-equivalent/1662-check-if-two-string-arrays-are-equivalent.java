class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //track current string index in each word1 and word2
        int i=0,j=0;
        //track the current character within word1[i] and word2[j]
        int p1=0,p2=0;
        //continue till one of the arrays is completely traversed
        while(i<word1.length && j<word2.length){
            //character compariso
            if(word1[i].charAt(p1)!=word2[j].charAt(p2)){
                return false;
            }
            //advance both pointers
            p1++;
            p2++;
            //end of current string in word1
            if(p1==word1[i].length()){
                i++;
                p1=0;
            }
            //end of current string in word2
            if(p2==word2[j].length()){
                j++;
                p2=0;
            }
        }
        //ensures both arrays finish at same time
        return i==word1.length && j==word2.length;
    }
}