class Solution {
    
    public int peakIndexInMountainArray(int[] arr) {
        
        int n = arr.length;
        
        int start = 0 , end = n - 1;
        
        //** simple binary search approach ->
        while(start < end) {
            
            int mid = start + (end - start) / 2;
            if(arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            }
            
            else {
              end = mid;
            }
        }
        
        return start;
        
    }
}

