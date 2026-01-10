class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = 1 + i; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result.add(i);
                    result.add(j);
                    break; 
                }
            }
            if (!result.isEmpty()) break;
        }
        
        int[] arrayFinal = result.stream().mapToInt(i -> i).toArray();
        return arrayFinal;
    }
}