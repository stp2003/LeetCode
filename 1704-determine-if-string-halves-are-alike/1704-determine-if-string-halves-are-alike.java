class Solution {
    
    public boolean halvesAreAlike(String s) {
        
        String vowels = "aeiouAEIOU";
        int a = 0, b = 0;
        
        for (int i = 0; i < s.length() / 2; i++) {
            
            if (vowels.indexOf(s.charAt(i)) != -1) 
                a++;
            
            if (vowels.indexOf(s.charAt(s.length() - 1 - i)) != -1) 
                b++;
        }
        
        return a == b;
        
    }
}
