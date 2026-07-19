class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int prefixSum = 0;
        for(int i = 0; i<nums.length; i++){
            prefixSum = prefixSum+nums[i];
            sums[i] = prefixSum;
        }
        return sums;
    }
}