class Solution 
{
    
    public int searchInsert( int [] nums , int target ) 
    {
        
       
        int index = 0;
      
        for (int num : nums) 
        {
          
          if(num == target)
              return index;
          
          if(num > target)
              return index;
          
          index++;
       }
      
      return index;
        
    }
}


