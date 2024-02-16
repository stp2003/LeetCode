class Solution {
    
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(frequencyMap.values());

        
        while (k > 0 && !minHeap.isEmpty()) {
            
            int minFrequency = minHeap.poll();
            
            if (k >= minFrequency) {
                k -= minFrequency;
            } 
            
            else {
                minHeap.add(minFrequency - k);
                k = 0;
            }
        }

        
        return minHeap.size();
        
    }
}
