class Solution {
    
    public int minOperations(String[] logs) {
        
        ArrayList<String> folder = new ArrayList<>();

        for (String log : logs) {
            
            if (log.equals("../")) {
                
                if (folder.size() > 1)
                    folder.remove(folder.size() - 1);
                
                else
                    folder.clear();

            } 
            
            else if (log.equals("./")) {
                continue;
            } 
            
            else
                folder.add(log);
        }
        
        return folder.size();

    }
}
