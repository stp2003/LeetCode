class Solution {
    public boolean searchMatrix(int[][] arr2D, int target) {
        
        int row = arr2D.length;
        int column = arr2D[0].length;
        int i = 0, j = column - 1;

        while (i < row && j >= 0) 
        {
            if (arr2D[i][j] == target) 
                return true;
            
            else if (arr2D[i][j] > target)
                j--;
                
            else
                i++;
        }
        
        return false;


    }
}


