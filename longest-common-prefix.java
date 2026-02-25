class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            for (int j = 0; j < prefix.length(); j++) {
                if (curr.length() <= j || curr.charAt(j) != prefix.charAt(j)){
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
}