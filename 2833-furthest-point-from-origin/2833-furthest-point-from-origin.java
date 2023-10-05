class Solution {
    
    public int furthestDistanceFromOrigin(String moves) {
        
        int countLeft = 0, countRight = 0, countSpace = 0;
        
        for(int i = 0; i < moves.length(); i++) {
            
            if(moves.charAt(i) == 'L') countLeft++;
            
            else if(moves.charAt(i) == 'R') countRight++;
            
            else countSpace++;
        }
        
        if(countRight > countLeft) 
            return countRight + countSpace - countLeft;
        
        return countLeft + countSpace - countRight;
        
    }
}

