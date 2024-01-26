class Solution {
    
    public int[] findErrorNums(int[] nums) {
        
        Arrays.sort(nums);
        int[] ans = new int[2];
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i - 1] == nums[i]) {
                ans[0] = nums[i];
            }
        }
        
        int total = 0, actual = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            total += i + 1;
            actual += nums[i];
        }

        ans[1] = total - (actual - ans[0]);
        
        return ans;
        
    }
}
