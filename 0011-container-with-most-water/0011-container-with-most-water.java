class Solution {
    public int maxArea(int[] height) {
        
        int first=0;
        
        int last=height.length-1; 
        
        int Area=0; 

        
        while(first<last)  
        { 
            
            if(height[first] < height[last])

            { 

                Area = Math.max(Area, height[first] * (last - first));
                first++;
            }
            
            else
            {
                Area = Math.max(Area,height[last] * (last-first));
                last--;
            }

        }
        
        return Area;
        
    }
}
