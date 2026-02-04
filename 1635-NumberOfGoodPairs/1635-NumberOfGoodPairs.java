// Last updated: 2/4/2026, 1:29:23 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap();
        int pairs=0;
        for(int x:nums){
            pairs+=freq.getOrDefault(x,0);
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        return pairs;
    }
}