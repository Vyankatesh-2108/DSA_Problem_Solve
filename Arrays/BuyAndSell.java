//Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit=0;
        for(int i=1; i<prices.length; i++){
            if(min > prices[i])
                min = prices[i];
            
            profit = prices[i]-min;
            if(profit>max)
                max = profit;
        }
        return max;
    }
}