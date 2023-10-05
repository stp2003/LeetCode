class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        List<Character> ans = new ArrayList<>();
        for(char i : letters) {
            ans.add(i);
        }
        
        int index = 0;
        for(int i = 0; i < ans.size(); i++) {
            if(ans.get(i) > target) {
                index = i;
                break;
            }
        }
        
        return ans.get(index);
        
    }
}
