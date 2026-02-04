// Last updated: 2/4/2026, 1:28:32 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(z-x);
        int d2=Math.abs(z-y);
        if(d1<d2) return 1;
        else if(d1>d2) return 2;
        else return 0;
    }
}