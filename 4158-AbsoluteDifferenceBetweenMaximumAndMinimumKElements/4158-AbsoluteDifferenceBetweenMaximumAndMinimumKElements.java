// Last updated: 2/4/2026, 1:28:37 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            minsum+=nums[i];
            maxsum+=nums[nums.length-1-i];
        }
        return Math.abs(maxsum-minsum);
        
    }
}