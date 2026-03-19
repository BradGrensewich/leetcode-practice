class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        boolean[] inSubString = new boolean[255];
        int left = 0;
        for (int right = 0; right < n; right++) {
            char curr = s.charAt(right);
            if (!inSubString[curr]) {
                inSubString[curr] = true;
                int currSize = right - left + 1; 
                max = max >= currSize ? max : currSize; 
            } else {
                while (s.charAt(left) != curr) {
                    inSubString[s.charAt(left)] = false;
                    left++;
                }
                left++;
            }           
           
        }
        return max;
    }
}