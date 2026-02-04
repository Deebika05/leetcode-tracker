// Last updated: 2/4/2026, 1:28:59 PM
class Solution {
    public int countDigits(int num) {
        int count=0;
        int c=num;
        while(num!=0){
            int d=num%10;
            if(c%d==0) count++;
            num/=10;
        }
        return count;
    }
}