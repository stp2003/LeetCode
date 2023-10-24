class Solution {
    
    public String generateTheString(int n) {
        
        StringBuilder res = new StringBuilder();

        if (n % 2 == 1) {
            res.append("x".repeat(n));
        } else {
            res.append("x".repeat(n - 1));
            res.append('y');
        }

        return res.toString();
        
    }
}

