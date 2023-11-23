class Solution {
    
    public boolean divideArray(int[] nums) {
        
        int[] flag = new int[1001];
        
        for (int num : nums) {
            flag[num]++;
        }
        
        for (int j : flag) {
            if (j % 2 == 1)
                return false;
        }

        return true;
        
    }
}
