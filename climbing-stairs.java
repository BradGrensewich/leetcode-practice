class Solution {
    public int climbStairs(int n) {
        int oneLower = 1;
        int twoLower = 1;
        for (int i = 1; i < n; i++) {
            int currSteps = oneLower + twoLower;
            twoLower = oneLower;
            oneLower = currSteps; 
        }
        return oneLower;        
    }
}