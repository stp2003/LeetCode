class Solution {
    
    public List<Integer> findPeaks(int[] mountain) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        //** start from 2 element and go till second last as 1st and last can't be peak.
        for (int i = 1; i < mountain.length - 1; i++) {
            
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
        }
        
        return ans;
        
    }
}
