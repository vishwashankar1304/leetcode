class Solution {
    public boolean canJump(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++,s--){
            if(s<0)return false;
            else if(nums[i]>s){
                s=nums[i];
            }
        }
        return true;
    }
}