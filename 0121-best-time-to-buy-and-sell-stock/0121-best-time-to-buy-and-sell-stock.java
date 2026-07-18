class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){

            int profits = prices[i] - minPrice;

            if(profits > profit){
                profit = profits;
            }

            minPrice = Math.min(prices[i], minPrice);
        }

        return profit;
    }
}