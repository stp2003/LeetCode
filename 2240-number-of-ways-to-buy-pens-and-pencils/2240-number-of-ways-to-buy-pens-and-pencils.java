class Solution {
    
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        long ans = 0;
        long penTotalCost = 0;
        long remainingTotal = total - penTotalCost;

        while (remainingTotal >= 0) {
            
            long totalQuantity = remainingTotal / cost2;
            ans += totalQuantity + 1;    //** adding 1 as we have to consider the possibility o selection 0 quantity also;
            penTotalCost += cost1;
            remainingTotal = total - penTotalCost;
        }

        return ans;
        
    }
}
