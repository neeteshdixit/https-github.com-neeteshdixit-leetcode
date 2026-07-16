class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        // Step 1: Normal Kadane (Maximum Subarray)
        int currentMax = nums[0];
        int maxSum = nums[0];

        // Step 2: Minimum Kadane (Minimum Subarray)
        int currentMin = nums[0];
        int minSum = nums[0];

        // Step 3: Total Sum
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            totalSum += nums[i];

            // Maximum Kadane
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum Kadane
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        // Edge Case:
        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Return maximum of normal and circular
        return Math.max(maxSum, totalSum - minSum);
    }
}