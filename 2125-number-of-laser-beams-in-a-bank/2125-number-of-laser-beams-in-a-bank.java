class Solution {
    
    public static int numberOfBeams(String[] bank) {
        
        int flag = 0;
        int ans = 0;

        for (String s : bank) {
            
            int currentCount = countOnes(s);

            if (currentCount > 0) {
                ans += flag * currentCount;
                flag = currentCount;
            }
        }

        return ans;
    }


    public static int countOnes(String s) {
        
        int count = 0;
        
        for (char c : s.toCharArray()) {
            
            if (c == '1') {
                count++;
            }
        }
        
        return count;
    }
}
