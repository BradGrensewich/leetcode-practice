class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr != val) {
                nums[k] = curr;
                k++;
            }
        }
        return k;
    }
}