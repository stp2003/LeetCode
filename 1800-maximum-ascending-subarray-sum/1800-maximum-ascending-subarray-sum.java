class Solution {
    
    public int maxAscendingSum(int[] nums) {
        
        int ans = nums[0], flag = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] > nums[i - 1])
                flag += nums[i];
            
            else
                flag = nums[i];
            
            ans = Math.max(ans, flag);
        }
        
        return ans;
    }
}
