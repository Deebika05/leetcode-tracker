// Last updated: 2/4/2026, 1:28:55 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem =time%(n-1);
        if(cycle%2==1){
            return n-rem;
        }else{
            return rem+1;
        }
    }
}