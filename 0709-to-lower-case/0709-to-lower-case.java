class Solution {
    public String toLowerCase(String s) {
        //mutable(it can modify the same object instead of creating a new one every time)
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //convert upper case characters to lower case using ASCII logic
            if(ch>='A'&&ch<='Z'){
                //adds data to the end of the existing sequence of characters.
                result.append((char)(ch+32));
            }
            else{
                result.append(ch);
            }
        }
        //return as String and not StringBuilder
        return result.toString();
    }
}