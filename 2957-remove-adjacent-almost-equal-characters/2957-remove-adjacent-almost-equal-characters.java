class Solution {
    
    public int removeAlmostEqualCharacters(String word) {
        
        int count = 0;
        
        for (int i = 0; i < word.length() - 1; ) {
            
            char a = word.charAt(i);
            char b = word.charAt(i + 1);
            
            if (a == b || (a + 1) == b || (a - 1) == b) {
                count++;
                i += 2;
            } 
            
            else {
                i++;
            }
        }
        
        return count;
        
    }
}
