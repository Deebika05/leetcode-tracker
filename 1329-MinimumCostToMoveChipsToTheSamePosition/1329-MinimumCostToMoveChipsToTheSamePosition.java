// Last updated: 2/4/2026, 1:29:30 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int x:position){
            if(x%2==0) even++;
            else odd++;
        }
        return even<odd?even:odd;
    }
}