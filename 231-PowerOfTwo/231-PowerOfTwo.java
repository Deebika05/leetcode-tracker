// Last updated: 2/4/2026, 1:30:10 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<0) return false;
       return(n>0) &&((n&(n-1))==0); 
    }
}