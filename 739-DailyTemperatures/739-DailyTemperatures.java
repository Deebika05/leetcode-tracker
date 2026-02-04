// Last updated: 2/4/2026, 1:29:44 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer>s=new Stack();
        int[] answer = new int[n];
        for(int cd=0;cd<n;cd++){
            int x=temperatures[cd];
            while(!s.empty() && x>temperatures[s.peek()]){
                answer[s.peek()]=cd-s.peek();
                s.pop();
            }
            s.push(cd);
        } 
        return answer;
    }      
}