class Solution {
    
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // cookies
        int j = 0; // children
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] < g[i]) {
                j++;
            } 
            
            else {
                i++;
                j++;
                count++;
            }
        }

        return count;
        
    }
}

