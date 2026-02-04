// Last updated: 2/4/2026, 1:28:52 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        //return(arrivalTime+delayedTime)%24;
        if((arrivalTime+delayedTime)<24){
            return arrivalTime+delayedTime;
        }else{
            return(arrivalTime+delayedTime)%24;
        }
    }
}