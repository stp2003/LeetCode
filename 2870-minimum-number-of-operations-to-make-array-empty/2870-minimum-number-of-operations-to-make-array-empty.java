class Solution {
    
    public int minOperations(int[] nums) {
        
        Arrays.sort(nums);

        int ans = 0;
        int start = 0;
        
        while (start < nums.length) {
            int flag = start;

            while (flag < nums.length && nums[flag] == nums[start]) {
                flag++;
            }
            
            int count = flag - start;
            
            if (count == 1) 
                return -1;
            
            ans += count / 3;

            if (count % 3 != 0) 
                ans++;
            
            start = flag;
        }
        
        return ans;
        
    }
}
