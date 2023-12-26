class Solution {
    
    public int countBinarySubstrings(String s) {
        
        int count = 1;
        int flag = 0;
        int ans = 0;
        
        for (int i = 1; i < s.length(); i++) {
            
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } 
            
            else {
                
                ans += Math.min(flag, count);
                flag = count;
                count = 1;
            }
        }

        ans += Math.min(flag, count);

        return ans;
        
    }
}
