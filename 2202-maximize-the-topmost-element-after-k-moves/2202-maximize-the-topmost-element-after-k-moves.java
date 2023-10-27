class Solution {
    
    public int maximumTop(int[] nums, int k) {
        
        if (nums.length == 1 && k % 2 == 1) return -1;
        
        if (k == 1) return nums[1];

        int ans = 0;

        if (k > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                ans = Math.max(ans, nums[i]);
            }
            
            return ans;
        } 
        
        else if (k == nums.length) {
            for (int i = 0; i < k - 1; i++) {
                ans = Math.max(ans, nums[i]);
            }
            
            return ans;
        } 
        
        else {
            for (int i = 0; i < k - 1; i++) {
                ans = Math.max(ans, nums[i]);
            }
            
            return Math.max(ans, nums[k]);
        }
    }
}
