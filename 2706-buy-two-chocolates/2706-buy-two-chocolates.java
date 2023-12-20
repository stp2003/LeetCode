class Solution {
    
    public int buyChoco(int[] price, int money) {
        
        Arrays.sort(price);
        
        int total = price[0] + price[1];
        
        return (money >= total) ? money - total : money;
        
    }
}
