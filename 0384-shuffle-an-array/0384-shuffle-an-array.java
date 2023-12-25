class Solution {

    public int[] nums;
    public Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    
    public int[] reset() {
        return nums;
    }

    
    public int[] shuffle() {
        
        int[] shuffle = nums.clone();
        
        for (int i = nums.length - 1; i > 0; i--) {
            
            int index = random.nextInt(i + 1);
            
            //** swap nums
            int temp = shuffle[i];
            shuffle[i] = shuffle[index];
            shuffle[index] = temp;
        }
        
        return shuffle;
    }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */