class Solution {

    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int lastWordIndex = s.lastIndexOf(' ') + 1;

        return (s.length() - lastWordIndex);
    }
}
