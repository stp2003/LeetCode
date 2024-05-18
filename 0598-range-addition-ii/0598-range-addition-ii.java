class Solution {
    
    public int maxCount(int m, int n, int[][] ops) {
        
        if (ops.length == 0) {
            return m * n;
        }

        
        int minrow = Integer.MAX_VALUE;
        int mincol = Integer.MAX_VALUE;
        
        for (int[] grid : ops) {
            
            minrow = Math.min (minrow, grid[0]);
            mincol = Math.min (mincol, grid[1]);
        }
        
        return minrow * mincol;
        
    }
}
