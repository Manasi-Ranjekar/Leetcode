//O(1) Complexity
class Solution {
    public int countOdds(int low, int high) {
        //calculate total numbers in the range
        //low=3,high=7 total=7-3+1=5
        int total = high - low + 1;
        //if total is even then exactly half of them are odd
        if (total % 2 == 0) {
            return total / 2;
        } 
        else {
            //if range starts form odd add 1 else add 0
            return total / 2 + (low % 2);
        }
    }
}