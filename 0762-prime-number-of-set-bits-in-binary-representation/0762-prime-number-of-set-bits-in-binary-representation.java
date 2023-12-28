class Solution {
    
    public int countPrimeSetBits(int left, int right) {
        
        int count = 0;
        
        for (int i = left; i <= right; i++) {
            
            int bitCount = Integer.bitCount(i);
            
            if (isPrime(bitCount)) {
                count++;
            }
        }
        
        return count;
    }
    
    

    public boolean isPrime(int num) {
        
        if (num <= 1) {
            return false;
        } 
        
        else if (num == 2) {
            return true;
        } 
        
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                
                if (num % i == 0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
