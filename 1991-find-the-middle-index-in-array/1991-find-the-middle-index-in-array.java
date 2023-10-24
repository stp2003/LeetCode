class Solution {
    
    public int findMiddleIndex(int[] nums) {
        
        if (nums.length < 1)
            return -1;

        int rightSum = 0, leftSum = 0;
        
        for (int x : nums)
            rightSum += x;

        for (int x = 0; x < nums.length; x++) {
            
            rightSum -= nums[x];
            if (rightSum == leftSum)
                return x;
            
            leftSum += nums[x];
        }
        
        return -1;
        
    }
}
