class Solution {
    public int heightChecker(int[] heights) {
        
        int [] copy = new int[heights.length];

        for(int i = 0; i < heights.length; i++) {
             copy[i] = heights[i];
        }

        Arrays.sort(copy);
        int count = 0;

        for(int i = 0; i < copy.length; i++) {
            if(heights[i] != copy[i])  
               count++;
        }

        return count;
    }
}
