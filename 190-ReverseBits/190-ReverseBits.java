// Last updated: 2/4/2026, 1:30:15 PM
class Solution {
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
            a<<=1;
            a=(a|(n&1));
            n>>=1;
        }
        return a;
    }
}