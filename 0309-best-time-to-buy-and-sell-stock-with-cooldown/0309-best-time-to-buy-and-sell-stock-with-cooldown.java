class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        int prev = 0;
        
        for(int i=0; i<n; i++){
            int temp = sell;
            sell = Math.max(sell, hold + prices[i]);
            hold = Math.max(hold, prev - prices[i]);
            prev = temp;
        }
        
        return sell;
    }
}




