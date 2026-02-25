class Solution {

    public int getDigits(int x) {
        int digits = 0;
        while (x > 0) {
            x /= 10;
            digits ++;
        }
        return digits;
    }

    public int getLSD(int x) {
        return x % 10;
    }

    public int getMSD(int x, int digits) {
        for (int i = 1; i < digits; i++) {
            x /= 10;
        }
        return x;
    }

    public int[] getAsArray(int x, int digits) {
        int[] numAsArray = new int[digits];
        for (int i = 0; i < digits; i++) {
            numAsArray[i] = getLSD(x);
            x /= 10;
        }
        return numAsArray;

    }

    public int getNextInternalNumber(int x, int digits) {
        int helper = 1;
        for (int i = 1; i < digits; i++) {
            helper *= 10;
        }
        x = x % helper;
        x /= 10;
        return x;        
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digits = getDigits(x);
        int[]  numAsArray = getAsArray(x, digits);
        for (int i = 0; i < digits; i++) {
           if (numAsArray[i] != numAsArray[digits - 1 -i]) {
            return false;
           }
        }
        
        return true;
    }
}