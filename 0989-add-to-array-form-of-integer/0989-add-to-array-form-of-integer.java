class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        int n = num.length - 1;
        
        while (n >= 0 || k != 0) {
            if (n >= 0) {
                k += num[n];
                n--;
            }
            
            ll.addFirst(k % 10);      // as in ll first will be last
            k /= 10;
        }
        
        return ll ;
        
    }
}