class Solution {
    
    public boolean canWinNim(int n) {
        
        if(n < 4)
           return true;
        
        if(n > 3) {
            if(n % 4 == 0)
                return false;
            else
               return true;
        }
        
        return false;
        
    }
}

