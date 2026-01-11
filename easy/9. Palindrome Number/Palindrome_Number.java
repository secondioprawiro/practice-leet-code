class Solution {
    public boolean isPalindrome(int x) {
        String now = String.valueOf(x);
        String rev = new StringBuilder(now).reverse().toString();

        if(now.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}