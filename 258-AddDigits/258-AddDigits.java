// Last updated: 2/4/2026, 1:30:07 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:num%9;
    }
}