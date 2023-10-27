class Solution {

    public boolean isHappy(int n) {
        
        int sum = 0;
        
       while (n != 1 && n != 4) {
        char[] digits = String.valueOf(n).toCharArray();
        sum = 0;
        for (char digitChar : digits) {
            int digit = digitChar - '0';
            sum += digit * digit;
        }
        n = sum;
    }
    
    return n == 1;
    }
}
