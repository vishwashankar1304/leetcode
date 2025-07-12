class Solution {
    public int fn(int i,int[] nums,int[] dp){
        if(i<0)return 0;
        if(i==0)return nums[i];
        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+fn(i-2,nums,dp);
        int notpick=0+fn(i-1,nums,dp);
        dp[i]= Math.max(pick,notpick);
        return dp[i];

    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        if(n==2)return Math.max(nums[0],nums[1]);
        int ans = fn(n-1,nums,dp);
        return ans;
    }
}