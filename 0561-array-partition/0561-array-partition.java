class Solution {
    
    public int arrayPairSum(int[] nums) {
        
        int res = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i = i + 2) {
            
            res = res + Math.min(nums[i], nums[i + 1]);
        }
        
        return res;
            
    }
}
