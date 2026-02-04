// Last updated: 2/4/2026, 1:29:54 PM
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] map="0123456789abcdef".toCharArray();
        //{'0','1','2','3','4','5','6','7','8','9','a'.'b','c','d','e','f'}
        StringBuffer ans=new StringBuffer();
        while(num!=0){
          int d=num&15;
          ans.append(map[d]);
          num>>>=4;
        }
        return ans.reverse().toString();
    }
}
