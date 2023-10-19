class Solution {
    
    public int pivotIndex(int[] nums) {
        
        int pivot = 0;
        
        while (pivot < nums.length) {
            
            int left = 0, right = 0;
            
            for (int i = 0; i < pivot; i++) {
                left += nums[i];
            }
            
            for (int i = pivot + 1; i < nums.length; i++) {
              
                right += nums[i];
            }
            
            if (left == right) {
                return pivot;
            } else {
                pivot++;
            }
        }
        
        return -1;
        
    }
}
