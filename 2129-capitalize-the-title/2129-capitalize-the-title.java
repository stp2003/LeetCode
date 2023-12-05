class Solution {
    
    public String capitalizeTitle(String title) {
        
        String[] space = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < space.length; i++) {
            space[i] = space[i].toLowerCase();

            if (space[i].length() <= 2) {
                result.append(space[i]).append(" ");
            } 
            
            else {
                space[i] = space[i].substring(0, 1).toUpperCase() + space[i].substring(1);

                result.append(space[i]).append(" ");
            }
        }
        
        return result.toString().trim();
        
    }
}
