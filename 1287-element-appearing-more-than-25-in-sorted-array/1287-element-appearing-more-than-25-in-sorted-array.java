class Solution {
    
    public int findSpecialInteger(int[] arr) {
        
        int quarter = arr.length / 4;
        
        for (int i = 0; i < arr.length - quarter; i++) {
            
            if (arr[i] == arr[i + quarter])
                return arr[i];
        }
        
        return -1;
        
    }
}
