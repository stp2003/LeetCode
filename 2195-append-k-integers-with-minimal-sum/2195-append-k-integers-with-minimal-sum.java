class Solution {
    
    public long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int flag = -1;
        long res = 0;
        
        for (int num : nums) {
            
            //** ignoring duplicate numbers.
            if (flag == num) 
                continue;
            
            //** If num > k, we already have found the needed k numbers upto num.
            if (num > k) 
                break;
            
            k++;
            res += num;
            flag = num;
        }

        return (long) (k + 1) * k / 2 - res;
        
    }
}
