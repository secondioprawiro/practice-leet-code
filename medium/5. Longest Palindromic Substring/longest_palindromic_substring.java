class Solution {
    public String longestPalindrome(String s) {
        String output = "";

        for(int i = 0 ; i < s.length(); i++){
            int left = i;
            int right = i;
            
            while(
                left >= 0 && 
                right < s.length() && 
                s.charAt(left) == s.charAt(right)
            ){
                String current = s.substring(left, right + 1);

                if (current.length() > output.length()) {
                    output = current;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                String current = s.substring(left, right + 1);

                if (current.length() > output.length()) {
                    output = current;
                }

                left--;
                right++;
            }
        }

        return output;
    }
}