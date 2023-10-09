class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int evenPos = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] % 2 == 0) {
                
                int temp = nums[evenPos];
                nums[evenPos] = nums[i];
                nums[i] = temp;
                
                evenPos++;
            }
        }

        return nums; 
        
    }
}

