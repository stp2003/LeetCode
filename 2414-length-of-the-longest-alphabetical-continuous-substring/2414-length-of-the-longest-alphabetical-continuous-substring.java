class Solution {
    
    public int longestContinuousSubstring(String s) {
        
        int count = 1, n = s.length();

        for (int i = 0; i < n; i++) {
            
            int flag = 1;
            
            while (i < n - 1 && s.charAt(i + 1) - s.charAt(i) == 1) {
                i++;
                flag++;

            }
            
            count = Math.max(count, flag);
        }
        
        return count;
        
    }
}
