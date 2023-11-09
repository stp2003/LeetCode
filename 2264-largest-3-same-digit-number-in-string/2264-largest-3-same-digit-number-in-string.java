class Solution {
    
    public String largestGoodInteger(String num) {
        
        int ans = -1;
        String res = ""; 
        
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                ans = Math.max(ans, num.charAt(i) - '0');
            }
        }
        
        String p = String.valueOf(ans);
        
        if (ans != -1) {
            res = p + p + p;
        }
        
        return res;
        
    }
}
