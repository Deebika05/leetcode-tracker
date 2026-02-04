// Last updated: 2/4/2026, 1:29:48 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Stack<Integer>stack=new Stack<>();
       int n=nums.length;
       int[] res=new int[n];
       Arrays.fill(res,-1);
       for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.empty() && num> nums[stack.peek()]) {
                res[stack.peek()] = num;
                stack.pop();
            }
            stack.push(i%n);
        }
        return res;
    }
}