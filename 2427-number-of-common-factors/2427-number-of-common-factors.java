class Solution {
    
    public int commonFactors(int a, int b) {
        
        int count = 0;
        int flag = Math.max(a, b);
        
        for(int i = 1; i <= flag; i++) {
            if(a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}

