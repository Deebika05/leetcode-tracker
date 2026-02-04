// Last updated: 2/4/2026, 1:29:39 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>hs=new HashSet();
        for(int x:nums){
            if(hs.contains(x)) {
                return x;
            }
            hs.add(x);
        }
        return -1;
    }
}