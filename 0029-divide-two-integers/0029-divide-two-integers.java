class Solution {
    
    public int divide(int dividend, int divisor) {
        
        long p = (long) dividend / (long) divisor;

        if (p > (long) Math.pow(2, 31) - 1) {
            p = (long) Math.pow(2, 31) - 1;
        }
        
        if (p < (-1) * (long) Math.pow(2, 31)) {
            p = (long) Math.pow(-2, 31);
        }
        
        return (int) p;
        
    }
}
