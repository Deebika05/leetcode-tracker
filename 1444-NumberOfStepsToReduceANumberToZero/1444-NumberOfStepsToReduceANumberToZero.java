// Last updated: 2/4/2026, 1:29:26 PM
class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }else{
                num=num-1;
            }
         step++;
        }
        return step;
    }
}