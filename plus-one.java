class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;

        // int carry = 1;
        // int n = digits.length;
        // for (int i = n - 1; i >= 0; i--) {
        //     int result = digits[i] + carry;
        //     digits[i] = result % 10;
        //     if (result > 9) {
        //         carry = 1;
        //     } else {
        //         carry = 0;
        //     }
        // }
        // if (carry == 1) {
        //     int[] bigger = new int[n + 1];
        //     bigger[0] = 1;
        //     for (int i = 0; i < n; i++) {
        //         bigger[i + 1] = digits[i];
        //         return bigger;
        //     }
        // }
        // return digits;   
    }
}