// Last updated: 2/4/2026, 1:29:57 PM
class Solution {
    public int firstUniqChar(String s){
        int[] freq=new int[123];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1) return i;
        }
        return -1;
    }
}