class Solution {
    
    public double minimumAverage(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;
        
        double min = Double.MAX_VALUE;
        
        Arrays.sort(nums);
        
        while(l <= r) {
            
            double avg = (nums[l] + nums[r]);
            avg = avg / 2;
            
            min = Math.min(avg, min);
            
            l++;
            r--;
        }
        
        return min;
        
    }
}
