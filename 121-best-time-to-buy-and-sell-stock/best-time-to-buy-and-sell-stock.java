class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int buyPrice = prices[0];
        int sellPrice = 0;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            // If we find a cheaper buying price
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } 
            // Otherwise, calculate profit by selling today
            else {
                sellPrice = prices[i];

                int profit = sellPrice - buyPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}