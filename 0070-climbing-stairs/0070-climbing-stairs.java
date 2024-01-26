class Solution {
    
    public int climbStairs(int n) {
        
        if (n <= 2) {
            return n;
        }

        int x = 1, y = 2;
        
        for (int i = 2; i < n; i++) {
            int steps = x;
            x = y;
            y = steps + x;
        }
        
        return y;
        
    }
}
