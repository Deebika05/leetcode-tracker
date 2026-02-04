// Last updated: 2/4/2026, 1:28:48 PM
class Solution {
    public int distanceTraveled(int MT, int AT) {
        int total=0;
        while(MT>=5){
            total+=50;
            MT-=5;
            if(AT>=1){
                MT++;
                AT--;
            }
        }
        return total+=(MT*10);
        
    }
}