class Solution {

    public String reversePrefix(String word, char ch) {
        
        StringBuilder ans = new StringBuilder();

        if (word.contains(String.valueOf(ch))) {

            int revIndex = word.indexOf(ch);

            for (int i = revIndex; i >= 0; i--) {
                ans.append(String.valueOf(word.charAt(i)));
            }

            ans.append(word.substring(revIndex + 1));

            return ans.toString();

        } else
            return word;
        
    }
}

