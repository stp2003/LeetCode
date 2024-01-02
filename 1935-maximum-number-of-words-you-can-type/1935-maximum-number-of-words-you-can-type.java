class Solution {
    
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String[] arr = text.split(" ");
        int count = 0;
        
        for (String s : arr) {
            
            for (int j = 0; j < brokenLetters.length(); j++) {
                
                if (s.contains(Character.toString(brokenLetters.charAt(j)))) {
                    count++;
                    break;
                }
            }
        }
        
        return (arr.length - count);
        
    }
}
