class Solution {

    public int distanceTraveled(int mainTank, int additionalTank) {
        
        int ans = 0;
        
        //** update ans for total additional fuel we can use
        while (mainTank >= 5 && additionalTank != 0) {
            
            ans += 50;
            additionalTank--;
            mainTank -= 4;   //?? -5 + 1
        }
        
        //** update ans for remaining fuel in mainTank
        ans += mainTank * 10;
        
        return ans;
        
    }
}
