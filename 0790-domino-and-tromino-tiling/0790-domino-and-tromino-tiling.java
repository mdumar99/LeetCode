class Solution {
    
    final int mod = 1_000_000_007;
    
    public int numTilings(int n) {
        
        if(n<=0) return 0;
        if(n<=2) return n;
        
        long[][] dp = new long[n + 1][3];
        dp[0][0] = 1;
        dp[1][0] = 1;
        
        for (int i = 2; i <= n; ++i) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
            dp[i][1] = (dp[i - 2][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 2][0] + dp[i - 1][1]) % mod;
        }
        
        return (int) dp[n][0];
    }
}


