class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x;
        while (low <= high) {
            long mid = (low + high) / 2;
            long midSquared = mid * mid;
            if(midSquared == x) {
                return (int)mid;
            }
            if (midSquared > x) {
                high = (int)mid - 1;
            } else {
                low = (int)mid + 1;
            }
        }
        return low -1;
    }
}