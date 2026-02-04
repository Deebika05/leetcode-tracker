// Last updated: 2/4/2026, 1:30:22 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n =gas.length;
        int totalcost=0;
        int remGas=0;
        int ans=0;
        for(int i=0;i<n;i++){
            totalcost+=gas[i]-cost[i];
            remGas+=gas[i]-cost[i];
            if(remGas<0){
                remGas=0;
                ans=i+1;
            }
        }
        return totalcost>=0?ans:-1;
    }
}