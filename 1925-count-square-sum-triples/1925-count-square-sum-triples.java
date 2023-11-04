class Solution {
    
    public int countTriples(int n) {
        
        int count = 0;
        
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && c * c == a * a + b * b)
                    count++;
            }
        }
        
        return count;
    }
}
