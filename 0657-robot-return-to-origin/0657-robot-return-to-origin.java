class Solution {
    
    public boolean judgeCircle(String moves) {
        
        int horizontal = 0, vertical = 0;
        
        for(char c : moves.toCharArray()) {
            
            if(c == 'U') horizontal++;
            else if(c == 'D') horizontal--;
            
            else if(c == 'R') vertical++;
            else if(c == 'L') vertical--;   
            
        }
        
        return (horizontal == 0 && vertical == 0);
        
    }
}
