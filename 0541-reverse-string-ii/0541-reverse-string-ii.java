class Solution {
    public String reverseStr(String s, int k) {
        
        char [] str = s.toCharArray();
        
        for(int i = 0; i <= str.length; i += 2 * k) {
            
            int left = i;
            
            //?? calculate right element (last character of 2k characters), if (i + k) - 1 index > str.length(), 
            // than use (s.length) - 1 index => last one ->
            int rigth = Math.min(i + k - 1, str.length - 1);  
            
            swap(str, left, rigth);
            
        }
        
        return String.valueOf(str);
        
    }
    
    
    private void swap(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
		    s[left++] = s[right];
		    s[right--] = temp;
        }
    }
    
}

