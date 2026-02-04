// Last updated: 2/4/2026, 1:29:12 PM
class Solution {
    public boolean isThree(int n) {
        int m=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) m++;
        }
        if(m==3) return true;
        return false;
    }
}