class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;
        int lastUnique = - 999;
        int lastUniqueIndex = 0;
        for (int i = 0; i < n ; i++) {
            int curr = nums[i]; 
            if (curr > lastUnique) {
                nums[lastUniqueIndex++] = curr;
                lastUnique = curr;
                k++; 
            }
        }
        return k;
    }
}