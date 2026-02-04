// Last updated: 2/4/2026, 1:28:44 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10<=4) return 100-(purchaseAmount/10)*10;
        else  return 100-((purchaseAmount/10)+1)*10;
    }
}