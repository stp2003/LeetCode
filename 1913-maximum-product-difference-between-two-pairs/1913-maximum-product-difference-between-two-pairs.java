class Solution {
    
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        
        int w = nums[nums.length - 1], x = nums[nums.length - 2], y = nums[0], z = nums[1];
        
        return ((w * x) - (y * z));
        
    }
}
