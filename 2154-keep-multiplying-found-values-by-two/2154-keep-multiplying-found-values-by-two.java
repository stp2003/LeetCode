class Solution {
    
    public int findFinalValue(int[] nums, int original) {
        
        for (int num : nums) {
            
            if (num == original) {
                
                original = 2 * original;
                return findFinalValue(nums, original);
            }
        }
        
        return original;
        
    }
}
