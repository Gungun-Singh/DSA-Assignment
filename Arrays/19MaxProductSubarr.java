/* 19. How to find the maximum product subarray. Write its algorithm, program. Find its time 
and space complexities. */


public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            if (nums[i] < 0) {
                // Swap currMax and currMin if current element is negative
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum Product Subarray: " + result);
    }
}



//TC - O(n)
//SC - O(1)
