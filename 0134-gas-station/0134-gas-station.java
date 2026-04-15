class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int i=n-1;
        int j=n-1;
        //tracking number of stations processed and current gas balance
        int stations=0;
        int gasBalance=0;
        while(stations<n){
            gasBalance+=gas[j]-cost[j];
            stations++;
            j=(j+1)%n;
            while(gasBalance<0 && stations<n){
                i--;
                gasBalance+=gas[i]-cost[i];
                stations++;
            }
        }
        return gasBalance<0?-1:i;
    }
}