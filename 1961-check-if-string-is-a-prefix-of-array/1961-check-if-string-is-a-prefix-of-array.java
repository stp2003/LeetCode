class Solution {
    
    public boolean isPrefixString(String s, String[] words) {
        
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : words) {
            
            stringBuilder.append(str);
            
            if (stringBuilder.toString().startsWith(s) && s.length() >= stringBuilder.toString().length()) {
                return true;
            }
        }
        
        return false;
        
    }
}
