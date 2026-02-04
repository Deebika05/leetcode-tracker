// Last updated: 2/4/2026, 1:28:46 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target) count++;
            
        }
        return count;
    }
}