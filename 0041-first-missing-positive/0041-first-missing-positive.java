class Solution {
    
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        
        int res = 1;
        
        for (int num : nums) {
            if (num == res) {
                res++;
            }

        }
        
        return res;
        
    }
}
