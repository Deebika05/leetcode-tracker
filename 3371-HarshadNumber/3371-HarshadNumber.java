// Last updated: 2/4/2026, 1:28:42 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0; 
        int c=x;
        while(x!=0){
           sum+=x%10;
           x/=10;
           

        }
        return (c%sum==0)?sum:-1;
    }
}