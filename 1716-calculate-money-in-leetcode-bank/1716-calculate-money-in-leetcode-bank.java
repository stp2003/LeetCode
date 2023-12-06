class Solution {
    
    public int totalMoney(int n) {
        
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            
            int curr_weak = i / 7;
            int curr_day = i % 7;
            
            ans += curr_weak + curr_day + 1;
        }
        
        return ans;
        
    }
}
