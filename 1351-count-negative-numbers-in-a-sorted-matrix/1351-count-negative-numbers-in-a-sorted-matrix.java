class Solution {
    
    public int countNegatives(int[][] grid) {
        
        int count = 0;

        int col = grid[0].length;

        for (int[] ints : grid) {
            
            for (int j = 0; j < col; j++) {
                
                if (ints[j] < 0) {
                    count++;
                }
            }
        }

        return count;
        
    }
}

