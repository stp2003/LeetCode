class Solution {
    
    public String validIPAddress(String IP) {
        
        if (IP.length() == 0) 
            return "Neither";

        if (IP.contains(".")) 
            return validateIPV4(IP);

        if (IP.contains(":")) 
            return validateIPV6(IP);

        
        return "Neither";
    }

    
    public String validateIPV4(String ip) {

        if (ip.charAt(0) == '.' || ip.charAt(ip.length() - 1) == '.')
            return "Neither";

        String[] component = ip.split("\\.");

        if (component.length != 4)
            return "Neither";

        for (String comp : component) {
            
            if (comp.length() == 0 || comp.length() > 3 || (comp.charAt(0) == '0' && comp.length() > 1)) {
                return "Neither";
            }

            for (char ch : comp.toCharArray()) {
                if (ch < '0' || ch > '9')
                    return "Neither";
            }

            int num = Integer.parseInt(comp);
            
            if (num < 0 || num > 255)
                return "Neither";
        }
        
        return "IPv4";
    }

    
    public String validateIPV6(String ip) {
        
        if (ip.charAt(0) == ':' || ip.charAt(ip.length() - 1) == ':')
            return "Neither";

        String[] component = ip.split(":");

        if (component.length != 8)
            return "Neither";

        for (String comp : component) {
            
            if (comp.length() == 0 || comp.length() > 4)
                return "Neither";

            
            for (char ch : comp.toLowerCase().toCharArray()) {
                if ((ch < '0' || ch > '9') && (ch != 'a' && ch != 'b' && ch != 'c' && ch != 'd' && ch != 'e' && ch != 'f')) {
                    return "Neither";
                }
            }
        }
        
        return "IPv6";
    }
}
