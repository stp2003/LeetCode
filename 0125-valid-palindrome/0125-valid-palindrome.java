class Solution {
    
    public boolean isPalindrome(String s) {
        
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        boolean ans = true;
        
        for (int i = 0; i < res.length(); i++) {
            
            if (res.charAt(i) == res.charAt(res.length() - 1 - i)) {
                continue;
            } else {
                ans = false;
            }
        }
        
        return ans == true;
        
    }
}

