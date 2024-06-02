class Solution {
    
    public void reverseString(char[] s) {
        
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append(s);
        
        stringBuilder.reverse();
        
        for (int i = 0; i < s.length; i++) {
            s[i] = stringBuilder.charAt(i);
        }
        
    }
}
