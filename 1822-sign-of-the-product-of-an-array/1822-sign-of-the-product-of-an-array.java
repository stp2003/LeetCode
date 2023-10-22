class Solution {
    
    public int arraySign(int[] nums) {
        
        int flag = 1;
        
        for (int num : nums) {
            if (num > 0) {
                flag = flag;
            } else if (num < 0) {
                flag *= -1;
            } else {
                flag *= 0;
            }
        }
        
        return Integer.compare(flag, 0);
    }
}
