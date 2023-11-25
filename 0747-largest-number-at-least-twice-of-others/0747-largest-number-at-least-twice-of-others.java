class Solution {
    
    public int dominantIndex(int[] nums) {
        
        int largest = -1;
        int flag = -1;
        int res = -1;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] > largest) {
                flag = largest;
                largest = nums[i];
                res = i;
            } else if (nums[i] > flag) {
                flag = nums[i];
            }
        }
        
        if (largest >= 2 * flag) {
            return res;
        }
        
        return -1;
        
    }
}
