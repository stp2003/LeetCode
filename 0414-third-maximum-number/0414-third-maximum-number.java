class Solution {
    
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        
        HashSet<Integer> res = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            
            res.add(nums[i]);
            
            if (res.size() == 3) 
                return nums[i];

        }
        
        return nums[nums.length - 1];
        
    }
}

