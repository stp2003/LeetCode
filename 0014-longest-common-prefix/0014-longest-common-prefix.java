class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0) return "";
        
        //** we will make 1st element as prefix and then chop off every chartec taht does not remain in prefix after compairing with other elements in the array.
        
        String prefix = strs[0];   
        
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
        
    }
}
