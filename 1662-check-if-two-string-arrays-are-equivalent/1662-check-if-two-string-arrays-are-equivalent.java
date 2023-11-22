class Solution {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        for (String s : word1) {
            stringBuilder1.append(s);
        }
        
        for (String s : word2) {
            stringBuilder2.append(s);
        }
        
        return stringBuilder1.toString().contentEquals(stringBuilder2);
        
    }
}
