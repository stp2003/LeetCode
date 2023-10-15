class Solution {
    
    public int kthFactor(int n, int k) {
        
        int res = 0;
        
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) {
                res += 1;
            }
            
            if (res == k) {
                return i;
            }
        }
        
        return -1;
        
    }
}
