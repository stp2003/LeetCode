class Solution {
    
    public void duplicateZeros(int[] arr) {
        
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j : arr) {
            
            if (j != 0) {
                ans.add(j);
            } else {
                ans.add(0);
                ans.add(0);
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = ans.get(i);
        }
        
    }
}

