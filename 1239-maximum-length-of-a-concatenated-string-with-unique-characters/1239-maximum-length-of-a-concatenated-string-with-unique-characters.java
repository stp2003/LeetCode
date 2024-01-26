class Solution {
    
    public int maxLength(List<String> arr) {
        
        int len = arr.size();
        int maxLen = 0;
        
        for (int mask = 0; mask <= (1 << len) - 1; mask++) {
            
            StringBuilder newStr = new StringBuilder();

            for (int indx = 0; indx < len; indx++) {
                if ((mask & (1 << indx)) != 0)
                    newStr.append(arr.get(indx));
            }
            
            if (isValid(newStr.toString()) && newStr.length() > 0) {
                maxLen = Math.max(maxLen, newStr.length());
            }
        }
        
        return maxLen;
    }

    
    private boolean isValid(String newStr) {
        
        int[] freq = new int[26];
        
        for (char c : newStr.toCharArray()) {
            if (freq[c - 'a']++ > 0)
                return false;
        }
        
        return true;
    }
}
