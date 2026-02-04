// Last updated: 2/4/2026, 1:30:28 PM
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int rev=0;
        int c=n;
        while(n!=0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(c==rev) return true;
        return false;
    
    }
}