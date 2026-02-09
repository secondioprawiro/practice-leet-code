class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int result = 0;
        int lastIndexNumbers = nums.length - 1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target || nums[i] >= target){
                result = i;
                break;
            }else if (nums[lastIndexNumbers] < target && nums[lastIndexNumbers] == nums[i]){
                result =  i + 1;
                break;
            }
        }

        return result;
    }
}