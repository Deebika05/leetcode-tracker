// Last updated: 2/4/2026, 1:29:06 PM
class Solution {
    public int commonFactors(int a, int b) {
        int m=0;
        int min=a<b?a:b;
        for(int x=1;x<=min;x++){
            if(a%x==0 && b%x==0) m++;
        }
        return m;
    }
}