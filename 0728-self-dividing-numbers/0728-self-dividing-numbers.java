class Solution {
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        
        return list;
    }

    public boolean isSelfDividing(int num) {
        
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || num % (c - '0') > 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
