class Solution {
    
    public int sumOfMultiples(int n) {

        int div3 = 0, div5 = 0, div7 = 0;
        
        for(int i = 0; i <= n; i++) {
            
            if(i % 3 == 0) div3 += i;
            else if(i % 5 == 0) div5 += i;
            else if(i % 7 == 0) div7 += i;
            
        }
        
        return (div3 + div5 + div7);
        
    }
}

