class Solution {
    
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] temp = sentence.split(" ");
        
        for (int i = 1; i <= temp.length; i++) {
            
            if (temp[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        
        return -1;
        
    }
}
