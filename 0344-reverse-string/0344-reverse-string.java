class Solution {
    public void reverseString(char[] s) {
        //initialize 2 pointers
        int right=s.length-1;
        int left=0;
        //traverse the string till both pointers cross or meet each other
        while(left<right){
            //swapping logic
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            //update the pointers
            left++;
            right--;
        }
    }
}