class Solution {
    
    public int maximumWealth(int[][] accounts) {
        
        int col = accounts[0].length;
        int ans = 0;

        for (int[] account : accounts) {
            
            int sum = 0;
            
            for (int j = 0; j < col; j++) {
                sum += account[j];
            }
            
            ans = Math.max(ans, sum);
        }
        
        return ans;
        
    }
}

