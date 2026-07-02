class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int highestArea = 0;

        for (int i = 0; i < height.length; i++){
            if (area > highestArea){
                highestArea = area;
            }

            area = Math.min(height[left], height[right]) * (right - left);

            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }

        return highestArea;
    }
}