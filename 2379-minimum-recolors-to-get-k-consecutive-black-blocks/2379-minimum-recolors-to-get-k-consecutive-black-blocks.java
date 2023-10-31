class Solution {
    
    public int minimumRecolors(String blocks, int k) {
        
        int count = Integer.MAX_VALUE;
        int n = blocks.length();
        
        for (int i = 0; i + k - 1 < n; i++) {

            int flag = 0;
            
            for (int j = i; j <= i + k - 1; j++) {

                if (blocks.charAt(j) == 'W')
                    flag++;
            }
            
            if (flag == 0)
                return 0;

            count = Math.min(count, flag);
        }
        
        return count;
    }
}
