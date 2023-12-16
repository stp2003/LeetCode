class Solution {
    
    public int removeDuplicates(int[] nums) {
        
        int count = 2;
        
        for (int i = 2; i < nums.length; i++) {
            
            if (nums[count - 2] != nums[i]) {
                
                nums[count] = nums[i];
                count++;
            }
        }
        
        return count;
        
    }
}
