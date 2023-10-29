class Solution {
    
    public long[] sumOfThree(long num) {
        
        long flag = num / 3;
        
        if (num % 3 == 0) {
            return new long[]{flag - 1, flag, flag + 1};
        }

        return new long[]{};
        
    }
}
