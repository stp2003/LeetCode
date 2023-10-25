class Solution {
    
    public int countDigits(int num) {
        
        int count = 0;
        int x = num;

        while (x != 0) {
            
            int t = x % 10;
            
            if (t != 0 && num % t == 0) 
                count++;
            
            x /= 10;
        }
        
        return count;
        
    }
}
