class Solution {
    
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        
        for (String operation : operations) {
            
            switch (operation) {
                    
                case "D" -> {
                    int res = stack.peek() * 2;
                    stack.add(res);
                    ans += res;
                }
                    
                case "C" -> ans -= stack.pop();
                    
                case "+" -> {
                    int res = stack.get(stack.size() - 2) + stack.peek();
                    stack.add(res);
                    ans += res;
                }
                    
                default -> {
                    int res = Integer.parseInt(operation);
                    stack.add(res);
                    ans += res;
                }
            }
        }
        
        return ans;
  
    }
}
