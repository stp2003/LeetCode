class Solution {
    
    public int minCost(String colors, int[] neededTime) {
        
        int ans = 0;
        int n = colors.length();
        
        for (int i = 1; i < n; i++) {
            
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                
                ans += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        
        return ans;
        
    }
}
