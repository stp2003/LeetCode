class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        
        int prefixProduct = 1;
        int suffixProduct = 1;

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return ans;
        
    }
}
