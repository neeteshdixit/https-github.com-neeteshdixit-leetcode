class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;       // last valid element in nums1
        int r2 = n - 1;       // last element in nums2
        int w = m + n - 1;    // write index

        while (r2 >= 0) {   // only need to place nums2
            if (r1 >= 0 && nums1[r1] > nums2[r2]) {
                nums1[w--] = nums1[r1--];
            } else {
                nums1[w--] = nums2[r2--];
            }
        }
    }
}
