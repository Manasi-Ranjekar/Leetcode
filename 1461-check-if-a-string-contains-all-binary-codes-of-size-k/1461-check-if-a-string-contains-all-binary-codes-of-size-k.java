class Solution {
    public boolean hasAllCodes(String s, int k) {
        boolean[] visited=new boolean[(int)Math.pow(2,k)];
        int l=0,r=k-1,dist=0;
        while(r<s.length()){
            String str=s.substring(l,r+1);
            int num=Integer.parseInt(str,2);
            if(!visited[num] && num<Math.pow(2,k)){
                dist++;
                visited[num]=true;
            }
            l++;
            r++;
        }
        if(dist==Math.pow(2,k))
            return true;
        return false;
    }
}