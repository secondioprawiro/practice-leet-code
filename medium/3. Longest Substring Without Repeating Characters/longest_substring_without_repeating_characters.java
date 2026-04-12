class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        String letter = "";

        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            while (letter.contains(String.valueOf(current))) {
                letter = letter.substring(1);
            }

            letter += current;
            result = Math.max(result, letter.length());
        }

        return result;
    }
}