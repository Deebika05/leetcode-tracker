// Last updated: 2/4/2026, 1:30:26 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=nums[0];
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs>ms){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
}