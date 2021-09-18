class Solution {
    public int maxProfit(int[] prices) {
        int minIndex = 0;
        int maxIndex = 0;
        int maxProfit = 0;
        
        while(maxIndex < prices.length){
            if(prices[maxIndex] < prices[minIndex]){
                minIndex = maxIndex;
                continue;
            }
            maxProfit = Math.max(maxProfit, prices[maxIndex] - prices[minIndex]);
            maxIndex++;
        }
        return maxProfit;
    }
}
