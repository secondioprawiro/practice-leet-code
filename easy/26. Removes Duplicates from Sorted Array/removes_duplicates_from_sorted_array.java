import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            if (!output.contains(num)) {
                output.add(num);
            }
        }

        for (int i = 0; i < output.size(); i++) {
            nums[i] = output.get(i);
        }

        return output.size();
    }
}