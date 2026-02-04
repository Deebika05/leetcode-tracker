// Last updated: 2/4/2026, 1:30:17 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            res = res*26+columnTitle.charAt(i) - 64;
        }
        return res;
    }
}