class Solution {
    
    public int[] separateDigits(int[] nums) {
        
        StringBuilder res = new StringBuilder();

        for (int i : nums) {
            res.append(i);
        }

        int[] ans = new int[res.length()];
        
        for (int i = 0; i < res.length(); i++) {
            ans[i] = res.charAt(i) - '0';
        }

        return ans;
        
    }
}
