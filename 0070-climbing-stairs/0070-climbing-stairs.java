class Solution {
    public int fibanocci(int n,int[] dp){
        if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]= fibanocci(n-1,dp)+fibanocci(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+2];
        Arrays.fill(dp,-1);
        int ans = fibanocci(n+1,dp);
        return ans;
    }
}