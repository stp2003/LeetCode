class Solution {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        //** we will add very element of nums in the set so that the duplicates are removed.
        for (int num : nums)
            set.add(num);

        //?? then we will add the elments in the list which are not present in the set
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) 
                ans.add(i);
        }
        
        return ans;
        
    }
}
