class Solution {
    
    public static int gcd(int num1, int num2) {
        
        if (num2 == 0)
            return num1;

        return gcd(num2, num1 % num2);
    }


    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        
        int n1 = nums[0];
        int n2 = nums[nums.length - 1];

        return gcd(n1, n2);

    }
}