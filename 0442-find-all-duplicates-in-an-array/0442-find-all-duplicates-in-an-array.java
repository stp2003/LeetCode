class Solution {

   public List < Integer > findDuplicates(int[] nums) {

      Set < Integer > hs = new HashSet < > ();
      List < Integer > ans = new ArrayList < > ();
       
      for (int x: nums) {
         boolean f = hs.add(x);
          
         if (!f)
            ans.add(x);
      }
       
      return ans;

   }
}
