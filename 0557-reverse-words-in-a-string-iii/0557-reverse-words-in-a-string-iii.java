class Solution {
    public String reverseWords(String s) {
       
        String [] res = s.split(" ");
        String rev = "";
        
        for(String w : res) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            
            rev += sb.toString() + " ";
        }
        
        return rev.trim();
    }
    
}

