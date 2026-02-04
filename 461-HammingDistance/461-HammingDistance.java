// Last updated: 2/4/2026, 1:29:51 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int n=x^y;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}