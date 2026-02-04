// Last updated: 2/4/2026, 1:29:38 PM
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        else return fib(n-1)+fib(n-2);
    }
}