// Last updated: 2/4/2026, 1:28:35 PM
class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                for(int k=i;k<=j;k++){
                    if(nums[k]==sum){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
        
    }
}