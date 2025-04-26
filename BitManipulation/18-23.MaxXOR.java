/* 18. AND 23. Find the maximum XOR of two numbers in an array. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example.  */


public class Solution {
    public static int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int xor = nums[i] ^ nums[j];
                maxXor = Math.max(maxXor, xor);
            }
        }
        
        return maxXor;
    }


//TC - O(n^2)
//SC - O(1)
