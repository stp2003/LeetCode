class Solution {
    
    public int minimumSum(int num) {
        
        int[] digits = new int[4];
        int i = 0;
        
        while (num > 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        
        Arrays.sort(digits);
        
        //?? we will only take 2 digits in consideration as a three digit will always we greater and we want min.
        int num1 = digits[0] * 10 + digits[2]; 
        int num2 = digits[1] * 10 + digits[3]; 
        
        return num1 + num2;
        
    }
}
