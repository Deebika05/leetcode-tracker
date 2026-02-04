// Last updated: 2/4/2026, 1:30:00 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0) return false;
        return((n>0 &&((n&(n-1))==0)) &(n&0b01010101010101010101010101010101)!=0);
    }
}