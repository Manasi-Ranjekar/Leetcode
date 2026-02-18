class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int bitOne=n&1;
            n>>=1;
            int bitTwo=n&1;
            if(bitOne==bitTwo){
                return false;
            }
        }
        return true;
    }
}