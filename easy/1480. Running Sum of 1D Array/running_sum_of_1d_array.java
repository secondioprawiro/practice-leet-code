class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;

        for(int j = 0; j < nums.length; j++){
            temp += nums[j];
            result[j] = temp;
        }
        return result;
    }
}