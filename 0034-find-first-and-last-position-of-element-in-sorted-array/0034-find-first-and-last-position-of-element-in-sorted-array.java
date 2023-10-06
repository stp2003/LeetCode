class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i : nums) {
            ans.add(i);
        }
        
        int [] res = new int[2];  // as there will only be 2 elements in the resultant array -> start and end index
        
        res[0] = ans.indexOf(target);
        res[1] = ans.lastIndexOf(target);
        
        return res;
        
    }
}

