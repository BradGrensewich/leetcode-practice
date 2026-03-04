class Solution { 
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (true) {
            if (low >= high) {
                if (low >= nums.length) {
                    return low;    
                } else if (high < 0) {
                    return 0;
                }
                return (target > nums[high]) ? high + 1 : low;
            }
            int mid = (high - low) / 2 + low;
            int curr = nums[mid];
            if (curr == target) {
                return mid;
            } else if (curr < target) {
                low = mid + 1;                
            } else {
                high = mid -1;
            }
        }
    }
}