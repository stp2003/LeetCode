class Solution {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxInititalCandies = 0;

        for (int candy : candies) {
            maxInititalCandies = Math.max(maxInititalCandies, candy);
        }

        List<Boolean> ans = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= maxInititalCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
        
    }
}

