class Solution {
    
    public int maximumNumberOfStringPairs(String[] words) {
        
        int count = 0;
        
        for (int i = 0; i < words.length; i++) {
            
            for (int j = i + 1; j < words.length; j++) {
                
                //** checking if word == rev(word) ->
                if (words[i].equals(words[j].charAt(1) + String.valueOf(words[j].charAt(0)))) {
                    count++;
                }
            }
        }
        
        return count;
        
    }
}
