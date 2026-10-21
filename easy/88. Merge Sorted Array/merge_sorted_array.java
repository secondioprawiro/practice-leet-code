import java.util.Collections;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            if (i+1 <= m){
                output.add(nums1[i]);                
            }
        }

        for (int i = 0; i < nums2.length; i++){
            if (i+1 <= n){
                output.add(nums2[i]);                
            }
        }

        Collections.sort(output);

        for (int i = 0; i < nums1.length; i++){
            nums1[i] = output.get(i);
        }
        
    }
}