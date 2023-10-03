class Solution {
    public char findTheDifference(String s, String t) {
        
        char ans = 0;
        
        for(char cS : s.toCharArray()) { 
            ans ^= cS;
        }
        
        for(char cT : t.toCharArray()) {
            ans ^= cT;
        }
        
        return ans;
        
    }
}
