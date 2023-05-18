class Solution {

    public boolean isPalindrome(int x) {
        int r, m, rev = 0;
        m = x;

        while (x > 0) {
            r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }

        if (rev == m) return true; 
        else return false;
    }
}
