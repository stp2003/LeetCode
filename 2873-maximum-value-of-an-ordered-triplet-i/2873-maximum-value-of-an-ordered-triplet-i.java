class Solution {
    
    public long maximumTripletValue(int[] nums) {
        
        long res = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            for (int j = i + 1; j < nums.length - 1; j++) {
                
                for (int k = j + 1; k < nums.length; k++) {
                    
                    long currScore = (long) (nums[i] - nums[j]) * nums[k];
                    res = Math.max(res, currScore);
                }
            }
        }
        
        return res;
        
    }
}
