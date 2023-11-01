class RandomizedSet {

    List<Integer> res;

    public RandomizedSet() {
        res = new ArrayList<>();
    }

    
    public boolean insert(int val) {
        if (res.contains(val)) {
            return false;
        }
        
        res.add(val);
        
        return true;
    }

    
    public boolean remove(int val) {
        if (res.contains(val)) {
            res.remove(Integer.valueOf(val));
            return true;
        }
        
        return false;
    }

    
    public int getRandom() {
        int randomIndex = (int) (Math.random() * res.size());
        
        return res.get(randomIndex);
        
    }
}



/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */