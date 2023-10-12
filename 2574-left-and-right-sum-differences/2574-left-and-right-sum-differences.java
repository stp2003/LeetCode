class Solution {
    
    public int[] leftRightDifference(int[] nums) {
        
        int rightSum = 0;
        int leftSum = 0;

        int[] res = new int[nums.length];

        //** sum of array
        for (int num : nums) {
            rightSum += num;
        }

        for(int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            res[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return res;
        
    }
}

