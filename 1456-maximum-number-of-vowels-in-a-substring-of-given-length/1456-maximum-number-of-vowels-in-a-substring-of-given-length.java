class Solution {
    
    public int maxVowels(String s, int k) {
        
        int left = 0, right = 0, res = 0, window = 0;
        
        for (; right < k; right++) {
            window += isVowel(s.charAt(right));
        }
        
        res = window;
        
        while (right < s.length()) {
            window -= isVowel(s.charAt(left++));
            window += isVowel(s.charAt(right++));
            res = Math.max(res, window);
        }
        
        return res;
    }

    public int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
    
}
