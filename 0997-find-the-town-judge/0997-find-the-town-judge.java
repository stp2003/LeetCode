class Solution {
    
    public int findJudge(int n, int[][] trust) {
        
        int[] trusting = new int[n + 1];
        int[] trusted = new int[n + 1];

        for (int[] ints : trust) {
            trusting[ints[0]]++;
            trusted[ints[1]]++;
        }

        int ans = -1;

        for (int i = 1; i <= n; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1)
                ans = i;
        }

        return ans;
        
    }
}