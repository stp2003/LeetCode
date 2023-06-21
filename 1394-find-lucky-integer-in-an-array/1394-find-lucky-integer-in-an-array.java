class Solution {
    public int findLucky(int[] arr) {
        
        int[] count = new int[501];   // as array length is 500 (given in the question)
        
        for (int n : arr) {
            count[n]++;
        }
        
        int max = -1;
        
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) 
                max = i;
        }
        
        return max;
        
    }
}

