class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapest = 99999999;
        int expensive = 0;
        for (int i = 0, n = prices.length; i < n; i ++) {
            int curr = prices[i];
            if (curr < cheapest) {
                cheapest = curr;
                expensive = curr; 
            } else if (curr > expensive) {            
                expensive = curr;
                int currProfit = expensive - cheapest;
                maxProfit = (currProfit > maxProfit) ? currProfit : maxProfit;
            }             
        }
        return maxProfit;
    }
}