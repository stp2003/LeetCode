class Solution {
    
    public boolean makeEqual(String[] words) {
        
        int[] res = new int[26];
        
        for (String word : words) {
            
            for (char c : word.toCharArray()) {
                
                //** counts no. of alphabets in String array ->
                //?? [2, 3, 3, 0, 0, ..., 0]
                res[c - 'a']++;
            }
        }

        for (int val : res) {
            
            if (val % words.length != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}
