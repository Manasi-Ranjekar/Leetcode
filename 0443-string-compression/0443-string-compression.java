class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int write=0;
        int i=0;
        while(i<n){
            char curr=chars[i];
            int count=0;
            while(i<n && chars[i]==curr){
                count++;
                i++;
            }
            chars[write++]=curr;
            if(count>1){
                char[] digits=String.valueOf(count).toCharArray();
                for(char digit:digits){
                    chars[write++]=digit;
                }
            }
        }
        return write;
    }
}