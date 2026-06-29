class Solution {
    //check if character is alphanumeric
    boolean isAlphaNumeric(char ch){
        return (ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9');
    }
    //convert upper case character to lower case
    char toLower(char ch){
        if(ch>='A' && ch<='Z'){
            ch=(char)(ch+32);
        }
        return ch;
    }
    public boolean isPalindrome(String s){
        //initialize 2 pointers one at beginning and other at the end of string
        int left=0;
        int right=s.length()-1;
        while(left<right){
            //skip any character that is not a letter or digit
            while(left<right && !isAlphaNumeric(s.charAt(left))){
                left++;
            }
            while(left<right && !isAlphaNumeric(s.charAt(right))){
                right--;
            }
            //compare the valid characters after converting both to the same case(lowercase)
            if(toLower(s.charAt(left))!=toLower(s.charAt(right))){
                return false;
            }
            //move both pointers inward
            left++;
            right--;

        }
        //if the pointer meet without finding a mismatch return true
        return true;
    }
}