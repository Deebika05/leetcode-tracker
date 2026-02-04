// Last updated: 2/4/2026, 1:28:53 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) 
             return k;
        else if(k<=numOnes+numZeros)
             return numOnes;
        else
             return numOnes -(k-(numOnes+numZeros));
    }
}