class Solution {
    
    public int arrangeCoins(int n) {
        
        int count = 0;
        
        while (n > 0) {
            
            count++;
            n = n - count;
        }
        
        return n < 0 ? count - 1 : count;
        
    }
}

