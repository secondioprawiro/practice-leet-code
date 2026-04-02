import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : nums1) {
            list.add(num);
        }

        for (int num : nums2) {
            list.add(num);
        }

        Collections.sort(list);

        int n = list.size();

        if (n % 2 == 1) {
            // odd
            double median = list.get(n / 2);
            return median;
        } else {
            // even
            double median = (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
            return median;
        }
    }
}