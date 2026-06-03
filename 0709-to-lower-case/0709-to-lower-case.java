class Solution {
    public String toLowerCase(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                result+=(char)(ch+32);
            }
            else{
                result+=ch;
            }
        }
        return result;
    }
}