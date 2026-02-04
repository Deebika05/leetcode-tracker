// Last updated: 2/4/2026, 1:30:19 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber==0){
            return "";
        }
        columnNumber--;
        return convertToTitle(columnNumber/26)+(char)('A' +columnNumber%26);
    }
}