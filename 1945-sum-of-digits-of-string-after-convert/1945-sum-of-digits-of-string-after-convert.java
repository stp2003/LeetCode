class Solution {
    
    public int sumOfDigit(int num) {
        
        int res = 0;
     
        while (num > 0) {
            int temp = num % 10;
            res += temp;
            num /= 10;
        }
        
        return res;
    }
    
    
    public int getLucky(String s, int k) {
        
        int sum = 0;
        char[] charArray = s.toCharArray();
        
        for (char ch : charArray) {
            sum += sumOfDigit(ch - 'a' + 1);
        }
        
        while (k - 1 > 0) {
            sum = sumOfDigit(sum);
            k--;
        }
        
        return sum;
    }
}
