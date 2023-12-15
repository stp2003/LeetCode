class Solution {
    
    public String destCity(List<List<String>> paths) {
        
        for (List<String> path : paths) {
            
            String dest = path.get(1);
            boolean exist = false;

            for (List<String> otherPath : paths) {
                
                if (otherPath.get(0).equals(dest)) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                return dest;
            }
        }
        
        return "";
        
    }
}
