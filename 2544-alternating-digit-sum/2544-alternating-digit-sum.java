class Solution {
    
    public int alternateDigitSum(int n) {
        
        StringBuilder res = new StringBuilder();
        res.append(n);
        
        int sum = 0;
        
        for (int i = 0; i < res.length(); i++) {
            if (i % 2 != 0) {
                sum -= res.charAt(i) - '0';
            } else {
                sum += res.charAt(i) - '0';
            }
        }
        
        return sum;
        
    }
}
