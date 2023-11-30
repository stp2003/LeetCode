class Solution {
    
    public int firstUniqChar(String s) {
        
        int ans = -1;
        
        for (char ch : s.toCharArray()) {
            
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }
        
        return ans;
        
    }
}
