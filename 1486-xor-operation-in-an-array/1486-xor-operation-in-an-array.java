class Solution {
    
    public int xorOperation(int n, int start) {
        
        int[] res = new int[n];
        int xor = 0;

        for (int i = 0; i < res.length; i++) {
            res[i] = start + 2 * i;
        }
        
        for (int j : res) {
            xor ^= j;
        }

        return xor;
        
    }
}

