class Solution {
    
    public int countHousePlacements(int n) {
        
        int a = 1, b = 1, c, mod = (int) 1e9 + 7;
        
        for (int i = 0; i < n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }
        
        return (int) ((long) b * b % mod);
        
    }
}
