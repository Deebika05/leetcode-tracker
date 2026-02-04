// Last updated: 2/4/2026, 1:30:14 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
           if((n&1)==1) count++;
           n=n>>1;
        }
        return count;
    }
}