class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
            int ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans+=1;
            }
            else{
                if(ans>nums.length/2)return nums[i];
                else ans=1;
            }
        }
       return nums[nums.length-1]; 
    }
}