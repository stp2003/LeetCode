class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0, product = 1, remainder;
           
        while(n != 0) {
           remainder = n % 10;
           product = product * remainder;
           sum = sum + remainder;
           n = n / 10;
        }
        
        return product - sum;
        
    }
}

