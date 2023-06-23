class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int n = nums.length , rightSum  = 0, leftSum = 0, totalSum = 0 ;
        
        for(int i: nums) 
            rightSum += i;
        
        for(int i = 0 ; i < n ; i++) {
            rightSum -= nums[i];
            leftSum += nums[i];
            
            totalSum = Math.abs((i + 1) * nums[i] -  leftSum) + Math.abs((n - i - 1) * nums[i] - rightSum);  
            nums[i] =  totalSum;
        }
        
        return nums;
        
    }
}

