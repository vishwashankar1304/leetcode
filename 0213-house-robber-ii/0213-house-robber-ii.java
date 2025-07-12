class Solution {
    public int f(int i,int[] nums,int[] dp){
        if(i<0)return 0;
        if(i==0)return nums[i];
        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+f(i-2,nums,dp);
        int notpick=0+f(i-1,nums,dp);
        dp[i]= Math.max(pick,notpick);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp = new int[n-1];
        Arrays.fill(dp,-1);
        int ans=f(n-2,nums,dp);
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        Arrays.fill(dp,-1);
        int ans1=f(n-2,nums,dp);
        return Math.max(ans,ans1);
    }
}