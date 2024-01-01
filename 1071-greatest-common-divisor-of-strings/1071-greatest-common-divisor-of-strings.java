class Solution {
    
    public int gcd(int num1, int num2) {
        
        if (num2 == 0)
            return num1;

        return gcd(num2, num1 % num2);
    }

    
    public String gcdOfStrings(String str1, String str2) {
        
        String s = str1 + str2;
        
        if (!s.equals(str2 + str1)) 
            return "";

        return str1.substring(0, gcd(str1.length(), str2.length()));
        
    }
}
