class Solution {
    
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);

        int ans = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            ans = (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        }

        return ans;
        
    }
}
