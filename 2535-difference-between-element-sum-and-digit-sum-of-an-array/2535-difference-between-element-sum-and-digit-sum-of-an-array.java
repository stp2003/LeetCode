class Solution {
    
    public int differenceOfSum(int[] nums) {
        
        int elementsum = 0, digitSum = 0;

        for (int i : nums) {
            elementsum += i;
        }

        StringBuilder res = new StringBuilder();

        for (int i : nums) {
            res.append(i);
        }

        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            int digit = Character.getNumericValue(c);
            digitSum += digit;
        }

        return (elementsum - digitSum);
        
    }
}
