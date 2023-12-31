class Solution {
    
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int res = -1;
        
        for (int left = 0; left < s.length(); left++) {
            
            for (int right = left + 1; right < s.length(); right++) {
                
                if (s.charAt(left) == s.charAt(right)) {
                    
                    res = Math.max(res, (right - left - 1));
                }
            }
        }
        
        return res;
        
    }
}
