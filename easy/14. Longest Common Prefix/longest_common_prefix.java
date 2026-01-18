import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        int lastIndex = strs.length - 1;

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[lastIndex];

        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)){
            output += first.charAt(i);
            i += 1;
        }
        return output;
    }
}