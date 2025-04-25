/* 41. Write a program to find the maximum subarray sum using Kadane’s algorithm.  */


public class MaximumSubarraySum {

     public int maxSubArray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;

            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
    }
}


//TC - O(N)
//SC - O(1)

