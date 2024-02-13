class Solution {
    
    public String firstPalindrome(String[] words) {
        
        for (String word : words) {
            
            StringBuilder reversed = new StringBuilder(word).reverse();
            
            if (word.contentEquals(reversed)) {
                return word;
            }
        }
        
        return "";
        
    }
}
