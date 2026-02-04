// Last updated: 2/4/2026, 1:28:33 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int n:nums){
            if(n<10) sd+=n;
            else dd+=n;
        }
        if(sd!=dd) return true;
        else return false;
    }
}