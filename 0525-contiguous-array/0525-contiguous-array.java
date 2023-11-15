class Solution {
    
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> hashMaps = new HashMap<>();
        
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            
            if (sum == 0)
                maxLength = i + 1;
            else if (hashMaps.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - hashMaps.get(sum));
            } else
                hashMaps.put(sum, i);
        }
        
        return maxLength;
        
    }
}
