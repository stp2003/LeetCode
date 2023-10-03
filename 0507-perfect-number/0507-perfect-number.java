class Solution {
    public boolean checkPerfectNumber(int num) {
     
        int sum = 0;
        int n = num;
        
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        
        return (n * 2) == sum;
        
    }
}