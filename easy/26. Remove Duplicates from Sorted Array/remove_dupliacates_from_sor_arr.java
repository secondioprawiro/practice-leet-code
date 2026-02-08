import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {      
        if (nums.length == 0) return 0;

        List<Integer> expectedNums = new ArrayList<>();

        for (int num : nums){
            if(val != num){
                expectedNums.add(num);
            }
        }

        Collections.sort(expectedNums);
        
        for (int i = 0; i < expectedNums.size(); i++){
            nums[i] = expectedNums.get(i);
        }

        return expectedNums.size();
    }
}