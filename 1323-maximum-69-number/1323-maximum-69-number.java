class Solution {
    
    public int maximum69Number (int num) {
        
        String ans = String.valueOf(num);
        
        ans = ans.replaceFirst("6", "9");    // it replaces first 6 with 9
        
        return Integer.parseInt(ans);
        
    }
}

