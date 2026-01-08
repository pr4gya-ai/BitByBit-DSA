class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = prices[n-1];
        int ans = 0;

        for(int i=n-2; i>=0; i--){
            ans = Math.max(ans, maxi - prices[i]);
            maxi = Math.max(prices[i], maxi);
        }
        return ans;
    }
}