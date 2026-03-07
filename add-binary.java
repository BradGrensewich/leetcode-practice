class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = 0;
        int aLength = a.length();
        int bLength = b.length();
        String out = "";
        while (aLength > i || bLength > i || carry == 1) {
            int count = 0;
            count += carry;
            int aIndex = (aLength - 1) - i;
            int bIndex = (bLength - 1) - i;
            if (aIndex >= 0) {
                count += a.charAt(aIndex) == '1' ? 1 : 0;
            }
            if (bIndex >= 0) {
                 count += b.charAt(bIndex) == '1' ? 1 : 0;
            }
           
            if (count % 2 == 0) {
                out = '0' + out;
            } else {
                out = '1' + out;
            }
            if (count > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            i++;
        }
        return out;        
    }
}