class Solution {
    
    public int lengthOfLIS(int[] nums) {
        
        int[] res = new int[nums.length];
        int length = 0;
        
        for (int x : nums) {
            
            int i = 0, j = length;
            
            while (i != j) {
                
                int m = (i + j) / 2;
                
                if (res[m] < x)
                    i = m + 1;
                
                else
                    j = m;
            }
            
            res[i] = x;
            
            if (i == length) 
                length++;
        }
        
        return length;
        
    }
}
