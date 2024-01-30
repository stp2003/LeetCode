class Solution {
    
    public int evalRPN(String[] tokens) {
        
        Stack<Long> stack = new Stack<>();
        
        for (String token : tokens) {
            
            if (token.length() == 1 && token.charAt(0) < 48) {
                
                long integer2 = stack.pop();
                long integer1 = stack.pop();
                char operator = token.charAt(0);
                long ans = operations(integer1, integer2, operator);
                
                stack.push(ans);
            } 
            
            else {
                stack.push(Long.parseLong(token));
            }
        }
        
        return stack.pop().intValue();
    }

    
    public long operations(long a, long b, char Operator) {
        
        if (Operator == '+') 
            return a + b;
        
        else if (Operator == '-') 
            return a - b;
        
        else if (Operator == '*') 
            return a * b;
        
        return a / b;
    }
}
