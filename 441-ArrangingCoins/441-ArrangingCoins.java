// Last updated: 2/4/2026, 1:29:52 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
    }
}