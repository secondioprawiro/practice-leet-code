class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split("\\s+");
        int arrayLength = word.length;
        int lastIndex = arrayLength - 1;
        int output = 0;
        
        output = word[lastIndex].length();
        return output;
    }
}