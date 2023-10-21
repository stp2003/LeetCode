class Solution {
    
    public int distributeCandies(int[] candyType) {
        
        Arrays.sort(candyType);
        
        int count = 1;
        int flag = candyType[0];

        for (int i : candyType) {

            if (i != flag) {
                count++;
                flag = i;
            }

        }
        
        return Math.min(count, candyType.length / 2);
        
    }
}
