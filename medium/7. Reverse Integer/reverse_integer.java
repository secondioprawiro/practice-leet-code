class Solution {
    public int reverse(int x) {
        String text = Integer.toString(x);

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        while (reversed.length() > 1 && reversed.charAt(0) == '0') {
            reversed.deleteCharAt(0);
        }

        if (reversed.charAt(reversed.length() - 1) == '-') {
            reversed.deleteCharAt(reversed.length() - 1);
            reversed.insert(0, '-');
        }
        
        long result = Long.parseLong(reversed.toString());

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}