class Solution {   
    public char partnerChar(char c) {
        if (c == '(') {
            return ')';
        }
        return (char)(c + 2);
        
    }

    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> nextCloseBracket = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                //track unclosed
                nextCloseBracket.push(partnerChar(c));
            } else {
                if (nextCloseBracket.empty() || c != nextCloseBracket.pop()) {
                    return false;
                }    
            }          
        }
        if (nextCloseBracket.empty()) {
            return true;
        }
        return false;
    }
}