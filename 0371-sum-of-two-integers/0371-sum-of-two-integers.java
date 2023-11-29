class Solution {
    
    public int getSum(int a, int b) {
        
        if (a == 0) 
            return b;
        
        if (a < 0)
            return getSum(++a, --b);
        
        else
            return getSum(--a, ++b);
        
    }
}
