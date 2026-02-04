// Last updated: 2/4/2026, 1:28:50 PM
class Solution {
    public int sumOfMultiples(int n) {
        int m=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0) m+=i;
        }
        return m;
    }
}