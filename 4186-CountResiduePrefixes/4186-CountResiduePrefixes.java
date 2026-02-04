// Last updated: 2/4/2026, 1:28:36 PM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen=new boolean[26];
        int distinct=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(!seen[idx]){
                seen[idx]=true;
                distinct++;
            }
            int len=i+1;
            if(distinct==len%3){
                count++;
            }
        }
        return count;
    }
}