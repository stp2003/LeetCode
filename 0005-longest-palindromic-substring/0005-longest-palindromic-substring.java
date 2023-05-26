class Solution {
    
    int startIndex, palenLength;
    
    public String longestPalindrome(String s) {
      if(s.length() < 2)  
          return s;
        
        for(int i = 0; i < s.length() - 1; i++) {
            helper(s, i, i);
            helper(s, i, i + 1); 
        }
         
        return s.substring(startIndex, startIndex + palenLength);
    }
    
    private  void helper(String s,int start ,int end){
        
        while(start >= 0 && end < s.length()  &&  s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        
        if(palenLength < end - start - 1) {
            startIndex = start + 1;
            palenLength = end - start - 1;
        }
    }
}