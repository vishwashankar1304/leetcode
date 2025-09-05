class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
    	// 	for (int i = 0; i < nums.length; i++) {
		//     int prefix = 1;
		//     int suffix = 1;
            
		//     for (int j = 0; j < i; j++) {
		//         prefix *= nums[j];
		//     }

		//     for (int j = i + 1; j < nums.length; j++) {
		//         suffix *= nums[j];
		//     }
		    
		//     output[i] = prefix * suffix;
		  
		// }

output[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            output[i]=output[i-1]*nums[i-1];
        }

int s=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            output[i]=output[i]*s;
            s*=nums[i];
        }
        return output;

    }
}