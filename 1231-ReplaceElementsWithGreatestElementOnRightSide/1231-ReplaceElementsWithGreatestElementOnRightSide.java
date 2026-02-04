// Last updated: 2/4/2026, 1:29:32 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;  
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];   
            arr[i] = maxRight;      
            if (current > maxRight) {
                maxRight = current; 
            }
        }
         return arr;
    }
}

