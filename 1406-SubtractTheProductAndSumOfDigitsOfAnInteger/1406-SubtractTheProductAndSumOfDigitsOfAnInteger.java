// Last updated: 2/4/2026, 1:29:27 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n!=0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        return product-sum;
    }
}