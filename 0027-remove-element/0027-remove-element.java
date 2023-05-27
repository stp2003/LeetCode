class Solution {
    
      public int removeElement(int[] a, int val) {
        int start= 0;
        int end= a.length-1;
        
          while(start <= end) {
            if(a[end] == val) {
                end--;
            }
            
            else if(a[start] == val) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                
                start++;
                end--;
            }
            
            else {
                start++; //when a[start] != val
            }
          }
        
        return end+1;
    }
}


        
        
        
    